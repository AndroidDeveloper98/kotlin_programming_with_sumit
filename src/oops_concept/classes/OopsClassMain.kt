package oops_concept.classes

/**
 *
 * A class is a blueprint for the objects which defines a template to be used to create the required objects.
 * Classes are the main building blocks of any Object-Oriented Programming language.
 *
 * A class is a user-defined data type that defines the properties and behaviors of objects.
 * A class can be used to organize information so that programmers can reuse elements when
 * creating multiple instances of that data type.
 *
 * The `Person` class represents an individual with a name and age, and includes methods to display information and celebrate a birthday.
 */
class Person(private val name: String, private var age: Int) {

    /**
     * Methods are functions that objects can perform, and are defined inside a class to describe an object's behavior.
     * This method displays the person's name and age.
     */
    fun displayInfo() {
        println("Name: $name, Age: $age")
    }

    /**
     * This method increments the person's age by 1 and prints a birthday message.
     * It demonstrates the behavior of celebrating a birthday.
     */
    fun haveBirthday() {
        age++
        println("Happy Birthday, $name! You are now $age years old.")
    }
}

fun main() {
    // Create an instance of the `Person` class.(Object of person)
    val person = Person("Alice", 30)

    // Call methods on the person object.
    person.displayInfo() // Output: Name: Alice, Age: 30
    person.haveBirthday() // Output: Happy Birthday, Alice! You are now 31 years old.
    person.displayInfo() // Output: Name: Alice, Age: 31
}