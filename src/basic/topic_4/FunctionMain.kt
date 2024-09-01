package basic.topic_4

/**
 * Greets the user with a personalized message.
 *
 * This function takes a user's name as input and returns a greeting message.
 *
 * @param name The name of the user to greet.
 * @return A greeting message in the form of "Hello, [name]!".
 */
fun greetUser(name: String): String {
    return "Hello, $name!"
}

/**
 * Multiplies the given integer by 5.
 *
 * This function takes an integer as input, multiplies it by 5, and returns the result.
 *
 * @param x The integer value to be multiplied.
 * @return The result of multiplying the input value by 5.
 */
fun multiplyByFive(x: Int): Int {
    return x * 5
}

/**
 * Prints a farewell message to the console.
 *
 * This function outputs a goodbye message to the console. It does not return any value.
 */
fun sayFarewell() {
    println("Goodbye, see you soon!")
}


/**
 * A function is like a small program that has its own name, and can be
 * executed (invoked) by calling that name from another function.
 *
 */
fun main() {

    // Function for greeting message.
    val greeting: String = greetUser("Alice")
    println(greeting)

    // Function for multiply by 5 program with given number.
    val number: Int = 4
    val result: Int = multiplyByFive(number)
    println("The result of multiplying $number by 5 is $result")  // Outputs: The result of multiplying 4 by 5 is 20

    // Function with return type.
    sayFarewell()
}