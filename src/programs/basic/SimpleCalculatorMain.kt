package programs.basic


/**
 * Swap Two Values: Write a program to interchange the values of two variables.
 *
 * Even or Odd: Write a program to check if a given number is even or odd.
 *
 * Factorial: Calculate the factorial of a given number.
 *
 * Fibonacci Sequence: Generate the Fibonacci sequence up to a given number.
 *
 * Prime Number Check: Write a program to check if a given number is prime.
 *
 * Reverse a String: Write a program to reverse a given string.
 *
 * Palindrome Check: Check if a given string is a palindrome (reads the same forwards and backwards).
 *
 * Sum of Digits: Calculate the sum of the digits of a given number.
 *
 * Largest of Three Numbers: Determine the largest of three given numbers.
 *
 * Temperature Conversion: Convert a temperature from Celsius to Fahrenheit and vice versa.
 *
 * Basic Calculator: Create a simple calculator that can perform addition, subtraction, multiplication, and division.
 *
 * Guess the Number: Implement a program where the computer randomly selects a number, and the user has to guess it.
 *
 * Sum of Natural Numbers: Calculate the sum of the first 'n' natural numbers.
 *
 * Counting Vowels: Count the number of vowels in a given string.
 *
 * Find the GCD: Find the greatest common divisor (GCD) of two numbers.
 */
fun main() {
    print("Enter first value : ")
    val firstValue = readln().toDouble()
    print("Enter second value : ")
    val secondValue = readln().toDouble()
    print("Select option to calculate(+,-,*,/,%) : ")
    val symbol = readln()
    val result: Double = when (symbol) {
        "+" -> firstValue + secondValue
        "-" -> firstValue - secondValue
        "*" -> firstValue * secondValue
        "/" -> firstValue / secondValue
        "%" -> firstValue % secondValue
        else -> 0.0
    }
    print("Calculation of given number : $result")
}

