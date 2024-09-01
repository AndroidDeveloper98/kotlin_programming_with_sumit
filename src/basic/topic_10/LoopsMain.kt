package basic.topic_10

/**
 * In Kotlin, loops are used to execute a block of code repeatedly as long as a specified condition is met or for a certain number of iterations.
 * Loops are essential for performing repetitive tasks and iterating over collections or ranges of values.
 */

fun main() {
    println("=====================")
    println("For loop with range")
    println("=====================")
    // 1. Looping from 1 to 10
    for (i in 1..10) {
        println("$i")
    }

    println("=====================")
    println("For loop with until")
    println("=====================")
    // 2. Looping from 0 to 9
    for (i in 0 until 10) {
        println("$i")
    }

    println("=====================")
    println("For loop with downTo")
    println("=====================")
    // 3. Looping from 10 to 0 in reverse order
    for (i in 10 downTo 0) {
        println("$i")
    }


    println("=====================")
    println("While loop")
    println("=====================")
    var i = 1  // Initialize the counter variable
    while (i <= 10) {  // Condition to continue the loop
        println("$i")  // Print the current value of i
        i++  // Increment the counter variable
    }

    println("=====================")
    println("Do-while loop")
    println("=====================")
    var j = 1  // Initialize the counter variable
    do {
        println("$j")  // Print the current value of i
        j++  // Increment the counter variable
    } while (j <= 10)  // Condition to continue the loop
}
