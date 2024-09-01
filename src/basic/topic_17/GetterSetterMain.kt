package basic.topic_17

fun main() {

    // Create an instance of PlayerName with initial values for name and age.
    val player = PlayerNameWithoutBackingField(name = "Virat", age = 35)

    // Update the name property of the player instance.
    player.name = "Rohit" // Sets the private _name backing field to "Rohit".

    // Update the age property of the player instance.
    player.age = 38 // Sets the private _age backing field to 38 since the value is positive.

    // Attempt to set the age property to an invalid value.
    player.age = -38 // Prints "Invalid age" because -38 is not a valid age, so _age remains unchanged.

    // Print the current values of the name and age properties.
    // The name is printed in uppercase due to the custom getter, and the age is the last valid value.
    println("${player.name}:${player.age}")
    // Output: "ROHIT:38"
}

class PlayerName(name: String, age: Int) {
    // Private backing field for the name property.
    private var _name = name

    // Private backing field for the age property.
    private var _age = age

    // Public property 'name' with a custom getter and setter.
    var name: String
        // Custom getter for the 'name' property.
        // Returns the name in uppercase.
        get() = _name.uppercase()
        // Custom setter for the 'name' property.
        // Sets the value of the private backing field '_name'.
        set(value) {
            _name = value
        }

    // Public property 'age' with a custom getter and setter.
    var age: Int
        // Custom getter for the 'age' property.
        // Returns the current value of the private backing field '_age'.
        get() = _age
        // Custom setter for the 'age' property.
        // Validates if the provided value is positive before setting the private backing field '_age'.
        // If the value is not positive, prints an error message.
        set(value) {
            if (value > 0) {
                _age = value
            } else {
                println("Invalid age")
            }
        }
}

/**
 * In Kotlin, field is a special keyword used within the custom getter and setter of a property.
 * It represents the backing field for the property and allows you to access or modify the value
 * stored in that backing field.
 */
class PlayerNameWithoutBackingField(name: String, age: Int) {
    // Public property 'name' initialized from the constructor parameter.
    // This property uses a custom getter and setter.
    var name: String = name
        // Custom getter for the 'name' property.
        // Returns the name in uppercase.
        // 'field' refers to the property value.
        get() = field.uppercase()
        // Custom setter for the 'name' property.
        // Sets the value of the property.
        set(value) {
            field = value
        }

    // Public property 'age' initialized from the constructor parameter.
    // This property uses a custom getter and setter.
    var age: Int = age
        // Custom getter for the 'age' property.
        // Returns the current value of the property.
        // 'field' refers to the property value.
        get() = field
        // Custom setter for the 'age' property.
        // Validates if the provided value is positive before setting the property.
        // If the value is not positive, prints an error message.
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Invalid age")
            }
        }
}