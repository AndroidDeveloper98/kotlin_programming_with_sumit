package basic.topic_12

/**
 * Function overloading in Kotlin allows you to define multiple
 * functions with the same name but different parameters.
 * It is a way to create multiple versions of a function
 * that perform similar tasks but operate on different types or numbers of arguments.
 */

fun main() {
    println(add(5, 10))          // Calls add(Int, Int)
    println(add(5.0, 10.0))      // Calls add(Double, Double)
    println(add(1, 2, 3))        // Calls add(Int, Int, Int)
}

// Overloaded function for adding two integers
fun add(a: Int, b: Int): Int {
    return a + b
}

// Overloaded function for adding two doubles
fun add(a: Double, b: Double): Double {
    return a + b
}

// Overloaded function for adding three integers
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}