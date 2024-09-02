package basic.topic_18


/**
 * An interface is a contract for a class that defines a set of abstract methods and properties.
 * Interfaces can also contain default implementations for methods.
 *
 *
 * An interface is a contract that defines a set of methods or properties that a class must implement.
 * Unlike abstract classes, interfaces do not hold state, although Kotlin does allow interfaces to include
 * default method implementations
 *
 */

// Define an interface `Greeting` with a single method `greeting()`
interface Greeting {
    fun greeting()
}

// Define another interface `BirthDay` with a single method `wish()`
interface BirthDay {
    fun wish()
}

// Create an open class `GreetingMessage` that implements both `Greeting` and `BirthDay` interfaces
open class GreetingMessage : Greeting, BirthDay {
    // Override the `greeting` method from `Greeting` interface
    override fun greeting() {
        println("Hello, this is a message")
    }

    // Override the `wish` method from `BirthDay` interface
    override fun wish() {
        // Empty implementation, can be overridden by subclasses
    }
}

// Define a class `GoodMorning` that inherits from `GreetingMessage`
class GoodMorning : GreetingMessage() {
    // Override the `greeting` method to provide a specific implementation
    override fun greeting() {
        println("Hello, Good Morning...")
    }

    // Override the `wish` method to provide a birthday wish message
    override fun wish() {
        println("Wish You Happy Birthday...")
    }
}

// Define a class `GoodAfterNoon` that inherits from `GreetingMessage`
class GoodAfterNoon : GreetingMessage() {
    // Override the `greeting` method to provide a specific afternoon greeting
    override fun greeting() {
        println("Hello, Good Afternoon...")
    }

    // No need to override `wish` as it is not required for this class
}

// Define a class `GoodEvening` that inherits from `GreetingMessage`
class GoodEvening : GreetingMessage() {
    // Override the `greeting` method to provide a specific evening greeting
    override fun greeting() {
        println("Hello, Good Evening...")
    }

    // No need to override `wish` as it is not required for this class
}

// Define a class `GoodNight` that inherits from `GreetingMessage`
class GoodNight : GreetingMessage() {
    // Override the `greeting` method to provide a specific night greeting
    override fun greeting() {
        println("Hello, Good Night...")
    }

    // No need to override `wish` as it is not required for this class
}

// The main function where execution begins
fun main() {
    // Create an instance of `GoodMorning`
    val goodMorning = GoodMorning()
    // Call the overridden `greeting` and `wish` methods
    goodMorning.greeting()
    goodMorning.wish()

    // Create an instance of `GoodNight`
    val goodNight = GoodNight()
    // Call the overridden `greeting` method
    goodNight.greeting()
    // Call the `wish` method, which is not overridden, so no output for this call
    goodNight.wish()
}