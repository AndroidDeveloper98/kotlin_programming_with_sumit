package basic.topic_8

/**
 * The when expression in Kotlin is a powerful control flow structure that allows you
 * to execute different blocks of code based on the value of an expression.
 * It's similar to the switch statement in other languages, but more versatile and expressive.
 */


fun main() {
    val dayOfWeek = 3
    when (dayOfWeek) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day") // Executes if dayOfWeek doesn't match any of the above
    }

    // Example: when used as an expression
    val number = 10
    val description = when (number) {
        in 1..10 -> "Number is between 1 and 10"
        in 11..20 -> "Number is between 11 and 20"
        else -> "Number is out of range"
    }
    println(description)
}
