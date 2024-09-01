package oops_concept.polymorphism

/**
 * In Kotlin, polymorphism refers to the ability of a function or method to take on multiple
 * forms depending on the context in which it is called. It is one of the fundamental principles
 * of object-oriented programming. Kotlin, being an object-oriented programming language,
 * supports both static and dynamic polymorphism.
 */

/**
 * Static Polymorphism (Compile-Time Polymorphism): Static polymorphism is achieved through function overloading.
 * Function overloading allows multiple functions to have the same name but with different parameter lists.
 * The appropriate function to be called is determined at compile time based on the number and types of arguments
 * passed.
 */

// Overloaded function to add two integers
fun add(a: Int, b: Int): Int {
    return a + b
}

// Overloaded function to add two doubles
fun add(a: Double, b: Double): Double {
    return a + b
}

/**
 * Dynamic Polymorphism (Runtime Polymorphism): Dynamic polymorphism is achieved through function
 * overriding and inheritance. Function overriding allows a subclass to provide a specific implementation
 * for a method that is already defined in its superclass. At runtime,
 * the correct method is determined based on the actual type of the object,
 * and the overridden method in the subclass is called.
 */

// Base class 'Shape' with an open method 'draw' that can be overridden
open class Shape {
    // Method to be overridden by subclasses
    open fun draw() {
        println("Drawing shape.")
    }
}

// 'Circle' class inherits from 'Shape' and overrides the 'draw' method
class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle.")
    }
}

// 'Square' class inherits from 'Shape' and overrides the 'draw' method
class Square : Shape() {
    override fun draw() {
        println("Drawing a square.")
    }
}

// Main function to test static and dynamic polymorphism
fun main() {
    // Demonstrating Static Polymorphism with function overloading
    val resultInt = add(2, 3)        // Calls the add function with Int parameters
    val resultDouble = add(2.5, 3.5) // Calls the add function with Double parameters
    println(resultInt)               // Outputs: 5
    println(resultDouble)            // Outputs: 6.0

    // Demonstrating Dynamic Polymorphism with method overriding
    val circle: Shape = Circle()     // Create an instance of Circle, but refer to it as a Shape
    val square: Shape = Square()     // Create an instance of Square, but refer to it as a Shape

    // The actual method called is determined at runtime based on the object type
    circle.draw() // Outputs: "Drawing a circle." (The draw method from Circle class is called)
    square.draw() // Outputs: "Drawing a square." (The draw method from Square class is called)
}