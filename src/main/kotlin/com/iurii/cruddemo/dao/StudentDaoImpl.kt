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
}