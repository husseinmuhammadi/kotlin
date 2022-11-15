package org.tutorial.kotlin.model

import java.lang.IllegalArgumentException

class Student(id: Long) {

    constructor(id: Long, name: String) : this(id) {
        println("constructor id = $id, name = $name")
        this.name = name
    }

    var name: String = ""
        get() = field
        set(value) {
            field = value
        }

    var studentId: String = ""
        get() = studentId.lowercase()
        set(value) {
            field = value
        }

    var age: Int = 0
        get() = field
        set(value) {
            if (value > 0) value else throw IllegalArgumentException("Age can not have negative value");
        }

    var id: Long
        private set

    init {
        this.id = id
        println("init: id = $id")
    }
}