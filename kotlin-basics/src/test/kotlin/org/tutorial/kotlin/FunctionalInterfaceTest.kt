package org.tutorial.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FunctionalInterfaceTest {

    @Test
    fun `creating an instance of a class`() {
        val isEven = object : IntPredicate {
            override fun accept(i: Int): Boolean {
                return i % 2 == 0
            }
        }

        val even = isEven.accept(5)
        Assertions.assertEquals(false, even)
    }

    @Test
    fun `creating an instance using lambda`() {
        val isEven = IntPredicate { it % 2 == 0 }
        val isOdd = IntPredicate { i -> i % 2 == 1 }

        assertEquals(true, isEven.accept(4))
        assertEquals(false, isOdd.accept(4))
    }

    @Test
    fun `callable references to functional interface constructors`(){
        fun Printer(block: () -> Unit): Printer = object : Printer { override fun print() = block() }
    }

}

fun interface Printer {
    fun print()
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}