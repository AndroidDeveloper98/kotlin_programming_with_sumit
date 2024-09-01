package basic.topic_9

/**
 * In Kotlin, a range is a powerful tool that allows you to define a sequence of values between two endpoints.
 * Ranges are used to iterate over a series of values, check if a value belongs to a certain interval,
 * and perform operations on sequences of numbers or characters.
 */

fun main() {
    // Example 1: Creating a numeric range
    val numberRange = 1..10
    // Iterating over the range
    for (num in numberRange) {
        print("$num ")  // Outputs: 1 2 3 4 5 6 7 8 9 10
    }
    println()

    // Checking if a number is within the range
    val isInRange = 5 in numberRange
    println("Is 5 in range: $isInRange")  // Outputs: true
}
