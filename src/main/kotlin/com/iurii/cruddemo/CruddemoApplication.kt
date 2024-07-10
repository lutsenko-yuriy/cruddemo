package com.iurii.cruddemo

import com.iurii.cruddemo.dao.StudentDao
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CruddemoApplication {

    @Bean
    fun commandLineRunner(studentDao: StudentDao): CommandLineRunner {
        return CommandLineRunner {
//            println(studentDao.findById(1))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<CruddemoApplication>(*args)
}
