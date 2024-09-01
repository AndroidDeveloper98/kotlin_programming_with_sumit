package basic.topic_14

/**
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

/**
 * An object is an instance of a class that has a state, which is the values of all its properties.
 * Objects can correspond to real-world objects or abstract entities.
 *
 * The `Configuration` object holds global configuration details for the application.
 * It is a singleton, meaning only one instance of it exists throughout the application.
 */
object Configuration {
    // Attributes represent the state of an object, and are the characteristics that distinguish classes.
    var appName: String = "MyApp"
    var version: String = "1.0.0"

    /**
     * Methods are functions that objects can perform. This method displays the application's configuration details.
     */
    fun displayConfig() {
        println("App Name: $appName")
        println("Version: $version")
    }
}

/**
 * The main function demonstrates how to use the `Person` class and the `Configuration` object.
 *
 * A class can be thought of as a blueprint for an object.
 * In this example, `Person` is a blueprint for creating individual people with name and age properties.
 * `Configuration` is a singleton object that provides global settings for the application.
 */
fun main() {
    // Create an instance of the `Person` class.(Object of person)
    val person = Person("Alice", 30)

    // Call methods on the person object.
    person.displayInfo() // Output: Name: Alice, Age: 30
    person.haveBirthday() // Output: Happy Birthday, Alice! You are now 31 years old.
    person.displayInfo() // Output: Name: Alice, Age: 31

    // Access properties and methods of the `Configuration` object directly.
    Configuration.appName = "UpdatedApp"
    Configuration.version = "1.1.0"

    // Display configuration details.
    Configuration.displayConfig()
    // Output:
    // App Name: UpdatedApp
    // Version: 1.1.0
}
