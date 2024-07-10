package com.iurii.cruddemo.dao

import com.iurii.cruddemo.entity.Student
import jakarta.persistence.EntityManager
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
class StudentDaoImpl(val entityManager: EntityManager): StudentDao {

    @Transactional
    override fun save(student: Student) {
        entityManager.persist(student)
    }

    override fun findById(id: Int): Student? {
        return entityManager.find(Student::class.java, id)
    }

    override fun findAll(): List<Student> {
        val typedQuery = entityManager.createQuery("FROM Student", Student::class.java)
        return typedQuery.resultList
    }

    override fun findByLastName(lastName: String): List<Student> {
        val typedQuery = entityManager.createQuery("FROM Student where lastName=:lastName", Student::class.java)

        typedQuery.setParameter("lastName", lastName)

        return typedQuery.resultList
    }

    @Transactional
    override fun update(student: Student) {
        entityManager.merge(student)
    }

    @Transactional
    override fun deleteStudentById(id: Int) {
        val student = entityManager.find(Student::class.java, id)
        entityManager.remove(student)
    }

    @Transactional
    override fun deleteAll(): Int {
        return entityManager.createQuery("DELETE FROM Student")
            .executeUpdate()
    }
}