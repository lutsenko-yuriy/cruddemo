package com.iurii.cruddemo.dao

import com.iurii.cruddemo.entity.Student

interface StudentDao {
    fun save(student: Student)
    fun findById(id: Int): Student?
    fun findAll(): List<Student>
    fun findByLastName(lastName: String): List<Student>
    fun update(student: Student)
    fun deleteStudentById(id: Int)
    fun deleteAll(): Int
}