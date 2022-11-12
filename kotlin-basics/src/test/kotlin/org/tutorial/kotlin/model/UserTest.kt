package org.tutorial.kotlin.model

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UserTest {
    @Test
    fun `create object from data class`() {
        val user = User("hmohammadi", "123456")
        println("user = $user")
    }
}