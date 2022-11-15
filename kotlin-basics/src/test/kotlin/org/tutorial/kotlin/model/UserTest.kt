package org.tutorial.kotlin.model

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserTest {

    private val user = User("hmohammadi", "123456")

    @Test
    fun `create object from data class`() {
        println("user = $user")
    }

    @Test
    fun `copy data class`() {
        val copy = user.copy(password = "12345678")

        println("user details: $user")
        println("user copy: $copy")
    }

    @Test
    fun `deconstruction`() {
        val (username, password) = user
        println("username: $username, password: $password")
    }
}