package org.tutorial.kotlin.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.tutorial.kotlin.model.Person
import java.util.*

class ExampleServiceTest {
    @Test
    fun `template sentence`() {
        val sentence = "Hello world!"
        val firstCharInSentence = sentence[0]
        val lastCharInSentence = sentence[sentence.length - 1]
        println("First character $firstCharInSentence")
        println("Last character $lastCharInSentence")
        println("The length of sentence is ${sentence.length}")
    }

    @Test
    fun `nullable values`() {
        var name: String? = "Hossein"
        val len = name?.length
        println("The len of the variable name is $len")
        name?.let { println(it.length) }

        var lastName: String = "Mohammadi"
        var lastNameLength: Int?

        if (lastName != null) {
            lastNameLength = lastName.length
        } else {
            lastNameLength = null
        }
        println("The len of the variable lastName is $lastNameLength")
    }

    /**
     * ?: Elvis operator
     */
    @Test
    fun `Elvis Operator`() {
        var nullableName: String? = "Hossein"
        var name: String = nullableName ?: "Default"
    }

    /**
     * Convert a nullable type to non-null type and
     * throws a NullPointerException if the nullable type holds a null value
     */
    @Test
    fun `Not Null Assertion`() {
        var name: String? = "Hossein"
        var len = name!!.length

        assertEquals(7, len)
    }

    @Test
    fun `Not Null Assertions with null value`() {
        assertThrows(NullPointerException::class.java) {
            var name: String? = null
            var len = name!!.length
        }
    }

    @Test
    fun `map nullable`() {

        var name: String? = "Hello"
        var lower = name?.map { it.lowercaseChar() }
        println(lower)

        val nums = listOf(1, 2, 3, 4).map { it.minus(1) }
        for (num in nums) {
            println(num)
        }
    }

    /**
     * In this scenario we convert Optional from java to nullable in Kotlin
     */
    @Test
    fun `convert optional to nullable`() {
        Assertions.assertEquals(/* expected = */ null, /* actual = */ convertOptionalToNullable(Optional.empty<Person>()))
    }

    private fun <T> convertOptionalToNullable(optional: Optional<T>): T? {
        return optional.map { it }.orElse(null)
    }
}