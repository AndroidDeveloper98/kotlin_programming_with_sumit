package basic.topic_7

/**
 * "if" keyword tests an expression to see whether it’s true or false and
 * performs an action based on the result. A true-or-false expression is called a
 * Boolean, after the mathematician George Boole who invented the logic behind
 * these expressions. Here’s an example using the > (greater than) and < (less than)
 * symbols:
 */

fun main() {
    // Example 1: Basic if-else statement
    val number = 10

    // Check if the number is positive
    if (number > 0) {
        println("$number is positive")
    } else {
        println("$number is not positive")
    }

    // Example 2: if-else-if ladder
    val age = 25

    // Check different conditions using if-else-if ladder
    if (age < 18) {
        println("You are a minor")
    } else if (age in 18..65) {
        println("You are an adult")
    } else {
        println("You are a senior citizen")
    }

    // Example 3: Using if-else as an expression
    val x = 5
    val y = 10

    // Use if-else as an expression to assign a value based on a condition
    val max = if (x > y) {
        x
    } else {
        y
    }
    println("The maximum value is $max")
}
