package com.iurii.cruddemo.entity

import jakarta.persistence.*

@Entity
@Table(name = "student", schema = "student_tracker")
open class Student(
    @Column(name = "first_name", length = 45) open var firstName: String? = null,
    @Column(name = "last_name", length = 45) open var lastName: String? = null,
    @Column(name = "email", length = 45) open var email: String? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false) open var id: Int? = null

    override fun toString(): String {
        return "Student(id=$id, firstName=$firstName, lastName=$lastName, email=$email)"
    }
}