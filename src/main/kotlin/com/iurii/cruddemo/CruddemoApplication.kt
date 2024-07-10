package com.iurii.cruddemo

import com.iurii.cruddemo.dao.StudentDao
import com.iurii.cruddemo.entity.Student
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CruddemoApplication {

    @Bean
    fun commandLineRunner(studentDao: StudentDao): CommandLineRunner {
        return CommandLineRunner {
            println("Creating a new student")
            val student = Student(
                firstName = "Iurii",
                lastName = "Lutsenko",
                email = "iurii@lutsenko.com",
            )

            println("Adding student to db")
            studentDao.save(student)

            println("Student saved. Assigned ID is ${student.id}")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<CruddemoApplication>(*args)
}
