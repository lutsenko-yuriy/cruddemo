package com.iurii.cruddemo.dao

import com.iurii.cruddemo.entity.Student

interface StudentDao {
    fun save(student: Student)
}