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
}