package programs.easy

/**
 * Calculate factorial of given number.
 */

fun main() {
    // Prompt the user to enter a number
    print("Enter number : ")

    // Read the user input, convert it to an integer
    val number = readln().toInt()

    // Initialize a variable to store the result of the factorial calculation
    var result: Long = 1

    // Check if the entered number is greater than 0
    if (number > 0) {
        // Loop from 1 to the entered number
        for (i in 1..number) {
            // Multiply the result by the current loop index
            result *= i
        }
    }

    // Print the factorial calculated using the iterative approach
    println("Factorial of $number : $result")

    // Print the factorial calculated using the recursive function
    println("Factorial of $number : ${factorial(number.toLong())}")
}

// Recursive function to calculate factorial
fun factorial(number: Long): Long {
    // Base case: if the number is 0 or 1, return 1
    return if (number == 0L || number == 1L) {
        1
    } else {
        // Recursive case: multiply the number by the factorial of (number - 1)
        number * factorial(number - 1)
    }
}
