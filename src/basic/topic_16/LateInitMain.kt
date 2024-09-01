package basic.topic_16

/**
 * In Kotlin, the "lateinit" keyword is used to declare a property that will be initialized later,
 * after the object has been created. This is particularly useful for properties that cannot be
 * initialized in the primary constructor or where the initialization depends on some conditions
 * or operations that are not available at the time of object creation.
 */

class User {
    // Declare a lateinit property
    lateinit var name: String

    // Method to initialize the property
    fun setUserName(newName: String) {
        name = newName
    }

    // Method to display the name
    fun displayName() {
        if (::name.isInitialized) {
            println("User name is: $name")
        } else {
            println("Name has not been initialized.")
        }
    }
}

fun main() {
    val user = User()

    // Display name before initialization
    user.displayName() // Output: Name has not been initialized.

    // Initialize the property
    user.setUserName("Alice")

    // Display name after initialization
    user.displayName() // Output: Username is: Alice
}
