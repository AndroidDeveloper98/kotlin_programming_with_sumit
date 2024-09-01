package programs.basic

/**
 * The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones,
 * usually starting with 0 and 1. So the sequence goes:
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 */
fun main() {
    // Prompt the user to enter a number
    print("Enter number to generate Fibonacci number : ")
    // Read the user's input and convert it to an integer
    val number = readln().toInt()

    // Initialize the first two Fibonacci numbers
    var a = 0
    var b = 1

    // Print the first two Fibonacci numbers
    println(a)
    println(b)

    // Loop from 2 to the user's input number
    for (i in 2..number) {
        // Calculate the next Fibonacci number
        val next = a + b
        // Update the values of 'a' and 'b'
        a = b
        b = next
        // Print the next Fibonacci number
        println(next)
    }
}