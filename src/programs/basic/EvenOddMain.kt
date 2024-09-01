package programs.basic

/**
 * Check given number even or odd.
 */

fun main() {
    print("Enter a number to check even or odd : ")
    val number = readln().toInt()
    if (number % 2 == 0) {
        println("Given number $number is even.")
    } else {
        println("Given number $number is odd.")
    }
}