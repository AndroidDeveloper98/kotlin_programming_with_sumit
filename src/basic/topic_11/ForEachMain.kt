package basic.topic_11

/**
 * forEach is a higher-order function that allows you to iterate over each element
 * of a collection and perform a specified action on each element.
 * It is commonly used in Kotlin to simplify iteration tasks in a more functional programming style.
 */

fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry")

    // Using forEach to iterate over elements
    println("Using forEach:")
    fruits.forEach { fruit ->
        println(fruit)  // Outputs: Apple Banana Cherry
    }

    // Using forEachIndexed to iterate over elements with their index
    println("\nUsing forEachIndexed:")
    fruits.forEachIndexed { index, fruit ->
        println("Index $index: $fruit")  // Outputs: Index 0: Apple, Index 1: Banana, Index 2: Cherry
    }
}
