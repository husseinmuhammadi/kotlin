package org.tutorial.kotlin

import org.junit.jupiter.api.Test

class ClassTest {

    @Test
    fun `create object from class with no properties`(){

        val person1 = PersonWithNoProperties()
        val person2 = PersonWithConstructor("firstName", "lastName")
        val person3 = PersonWithPublicConstructor("firstName", "lastName")
    }

    @Test
    fun `create a new person`(){
        var person = PersonWithInitializer("Hossein", "Mohammadi")
    }

}

class PersonWithNoProperties
class PersonWithConstructor constructor(firstName:String, lastName:String)

class PersonWithPrivateConstructor private constructor(firstName: String, lastName: String)
class PersonWithPublicConstructor public constructor(firstName: String, lastName: String)

class PersonWithInitializer(firstName:String, lastName:String) {

    // initializer block
    init {
        println("Initialized a new Person with firstName = $firstName and lastName = $lastName")
    }

}
