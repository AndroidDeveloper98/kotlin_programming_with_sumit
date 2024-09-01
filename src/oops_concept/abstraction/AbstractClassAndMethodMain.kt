package oops_concept.abstraction

/**
 * In Kotlin, an abstract class is a class that cannot be instantiated directly and is meant to be
 * subclassed by other classes. Abstract classes are used to define common behavior and
 * characteristics that should be shared among multiple subclasses,
 * but they may leave certain details to be implemented
 * by the concrete subclasses.
 */


// Define an abstract class 'Shape' with an abstract method 'calculateArea'
abstract class Shape {
    // Abstract method that must be implemented by subclasses to calculate area
    abstract fun calculateArea(): Double
}

// Define a 'Circle' class that inherits from 'Shape'
class Circle(val radius: Double) : Shape() {
    // Override the 'calculateArea' method to provide a specific implementation for Circle
    override fun calculateArea(): Double {
        // Calculate the area of the circle using the formula: π * radius^2
        return Math.PI * radius * radius
    }
}

// Define a 'Rectangle' class that inherits from 'Shape'
class Rectangle(val width: Double, val height: Double) : Shape() {
    // Override the 'calculateArea' method to provide a specific implementation for Rectangle
    override fun calculateArea(): Double {
        // Calculate the area of the rectangle using the formula: width * height
        return width * height
    }
}

// Main function to create instances of Circle and Rectangle and calculate their areas
fun main() {
    // Create a Circle object with a radius of 6.0
    val circle = Circle(6.0)
    // Create a Rectangle object with a width of 4.0 and height of 6.0
    val rectangle = Rectangle(4.0, 6.0)
    // Print the area of the circle by calling the overridden 'calculateArea' method
    println("Circle Area: ${circle.calculateArea()}")  // Outputs: Circle Area: 113.09733552923255
    // Print the area of the rectangle by calling the overridden 'calculateArea' method
    println("Rectangle Area: ${rectangle.calculateArea()}")  // Outputs: Rectangle Area: 24.0
}