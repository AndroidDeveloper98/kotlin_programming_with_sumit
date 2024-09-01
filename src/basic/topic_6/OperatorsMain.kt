package basic.topic_6

fun main() {
    // Arithmetic Operators
    val a = 10
    val b = 5

    val sum = a + b        // Addition: Adds a and b
    val difference = a - b // Subtraction: Subtracts b from a
    val product = a * b    // Multiplication: Multiplies a by b
    val quotient = a / b   // Division: Divides a by b
    val remainder = a % b  // Modulus: Remainder of division of a by b

    // Output results
    println("Arithmetic Operators:")
    println("Sum: $sum")                 // Outputs: 15
    println("Difference: $difference")   // Outputs: 5
    println("Product: $product")         // Outputs: 50
    println("Quotient: $quotient")       // Outputs: 2
    println("Remainder: $remainder")     // Outputs: 0

    // Comparison Operators
    val isEqual = a == b      // Equality: Checks if a equals b
    val isNotEqual = a != b   // Inequality: Checks if a does not equal b
    val isGreater = a > b     // Greater than: Checks if a is greater than b
    val isLess = a < b        // Less than: Checks if a is less than b
    val isGreaterOrEqual = a >= b // Greater than or equal to: Checks if a is greater than or equal to b
    val isLessOrEqual = a <= b    // Less than or equal to: Checks if a is less than or equal to b

    // Output results
    println("\nComparison Operators:")
    println("Is Equal: $isEqual")             // Outputs: false
    println("Is Not Equal: $isNotEqual")      // Outputs: true
    println("Is Greater: $isGreater")         // Outputs: true
    println("Is Less: $isLess")               // Outputs: false
    println("Is Greater Or Equal: $isGreaterOrEqual") // Outputs: true
    println("Is Less Or Equal: $isLessOrEqual")       // Outputs: false

    // Logical Operators
    val condition1 = true
    val condition2 = false

    val logicalAnd = condition1 && condition2 // Logical AND: true if both condition1 and condition2 are true
    val logicalOr = condition1 || condition2  // Logical OR: true if either condition1 or condition2 is true
    val logicalNot = !condition1              // Logical NOT: true if condition1 is false

    // Output results
    println("\nLogical Operators:")
    println("Logical AND: $logicalAnd") // Outputs: false
    println("Logical OR: $logicalOr")   // Outputs: true
    println("Logical NOT: $logicalNot") // Outputs: false

    // Assignment Operators
    var c = 5
    c += 3  // Addition assignment: c = c + 3
    c -= 2  // Subtraction assignment: c = c - 2
    c *= 2  // Multiplication assignment: c = c * 2
    c /= 2  // Division assignment: c = c / 2
    c %= 2  // Modulus assignment: c = c % 2

    // Output results
    println("\nAssignment Operators:")
    println("Final value of c: $c") // Outputs: 1

    // Increment and Decrement Operators
    var counter = 10
    counter++ // Increment: Increases counter by 1
    counter-- // Decrement: Decreases counter by 1

    // Output results
    println("\nIncrement/Decrement Operators:")
    println("Counter after increment and decrement: $counter") // Outputs: 10

    // Range Operator
    println("\nRange Operator:")
    for (i in 1..5) {
        print("$i ") // Outputs: 1 2 3 4 5
    }
    println()

    // Type Checking and Casting Operators
    val obj: Any = "Kotlin"

    if (obj is String) {
        println("\nType Checking and Casting Operators:")
        println("Length of string: ${obj.length}") // Smart cast to String
    }

    // Unsafe cast using 'as'
    val str: String = obj as String
    println("String after cast: $str") // Outputs: Kotlin
}
