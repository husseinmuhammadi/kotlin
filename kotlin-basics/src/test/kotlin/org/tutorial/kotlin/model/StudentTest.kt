package org.tutorial.kotlin.model

import org.junit.jupiter.api.Test

class StudentTest {
    @Test
    fun `create student object`() {
        var student: Student = Student(1, "Asghar")
    }
}