package basic.topic_13

/**
 * In Kotlin, arrays are a fundamental data structure that allows you to
 * store multiple values of the same type in a single variable.
 * Kotlin provides built-in support for arrays with various functions and properties
 * to manipulate and access their elements.
 */

fun main() {
    // Using arrayOf
    // Creates an array with the specified elements.
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Array created with arrayOf: ${numbers.joinToString(", ")}")

    // Using Array constructor
    // Creates an array of a specified size, all elements initialized to a specific value.
    val zeros = Array(5) { 0 }
    println("Array created with Array constructor: ${zeros.joinToString(", ")}")

    // Using specific type functions
    // Creates an array of integers using intArrayOf.
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    // Creates an array of doubles using doubleArrayOf.
    val doubleArray = doubleArrayOf(1.1, 2.2, 3.3)
    println("Int array: ${intArray.joinToString(", ")}")
    println("Double array: ${doubleArray.joinToString(", ")}")

    // 2. Accessing and Modifying Elements

    // Accessing Elements
    // Access elements using indices. Arrays are zero-indexed.
    val firstElement = numbers[0]  // Accesses the first element
    val thirdElement = numbers[2]  // Accesses the third element
    println("First element: $firstElement")  // Outputs: First element: 1
    println("Third element: $thirdElement")  // Outputs: Third element: 3

    // Modifying Elements
    // Modify elements by assigning new values to specific indices.
    numbers[1] = 10  // Changes the second element to 10
    println("Modified array: ${numbers.joinToString(", ")}")  // Outputs: Modified array: 1, 10, 3, 4, 5

    // 3. Array Properties and Functions

    // Size of the Array
    // Get the number of elements in the array.
    println("Size of array: ${numbers.size}")  // Outputs: Size of array: 5

    // Using forEach
    // Iterate over each element in the array and perform an action.
    println("Using forEach:")
    numbers.forEach { println(it) }
    // Outputs:
    // 1
    // 10
    // 3
    // 4
    // 5

    // Using map
    // Transform each element of the array and create a new array with the results.
    val doubled = numbers.map { it * 2 }
    println("Array after map operation: ${doubled.joinToString(", ")}")  // Outputs: Array after map operation: 2, 20, 6, 8, 10

    // Using filter
    // Filter elements based on a condition and create a new array with elements that match the condition.
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Filtered array (even numbers): ${evenNumbers.joinToString(", ")}")  // Outputs: Filtered array (even numbers): 10, 4

    // Using contains
    // Check if the array contains a specific value.
    val containsThree = numbers.contains(3)
    println("Array contains 3: $containsThree")  // Outputs: Array contains 3: true

    // Additional Array Operations

    // Using first
    // Get the first element of the array.
    val firstElementOrNull = numbers.firstOrNull()
    println("First element or null: $firstElementOrNull")  // Outputs: First element or null: 1

    // Using last
    // Get the last element of the array.
    val lastElementOrNull = numbers.lastOrNull()
    println("Last element or null: $lastElementOrNull")  // Outputs: Last element or null: 5

    // Using sorted
    // Get a new array with elements sorted in ascending order.
    val sortedArray = numbers.sorted()
    println("Sorted array: ${sortedArray.joinToString(", ")}")  // Outputs: Sorted array: 1, 3, 4, 5, 10

    // Using reversed
    // Get a new array with elements in reversed order.
    val reversedArray = numbers.reversed()
    println("Reversed array: ${reversedArray.joinToString(", ")}")  // Outputs: Reversed array: 5, 4, 3, 10, 1
}
