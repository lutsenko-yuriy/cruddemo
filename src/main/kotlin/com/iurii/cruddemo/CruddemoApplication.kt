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
            studentDao.save(
                Student("Iurii", "Iurii", "iurii@iurii.com")
            )
        }
    }
}

fun main(args: Array<String>) {
    runApplication<CruddemoApplication>(*args)
}
