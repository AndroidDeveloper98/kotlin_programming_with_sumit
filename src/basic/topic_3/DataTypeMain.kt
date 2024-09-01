package basic.topic_3

/**
 * This is a Kotlin program that demonstrates the usage of various Kotlin data types.
 */
fun main() {
    // Basic Data Types

    /**
     * Byte: An 8-bit signed integer type.
     */
    val typeByte: Byte = 100

    /**
     * Short: A 16-bit signed integer type.
     */
    val typeShort: Short = 5000

    /**
     * Int: A 32-bit signed integer type, commonly used for integers.
     */
    val typeInt: Int = 1000000

    /**
     * Long: A 64-bit signed integer type, used when a wider range is needed.
     * The 'L' suffix denotes a Long value.
     */
    val typeLong: Long = 1000000000L

    /**
     * Float: A 32-bit floating-point number, used for precise fractional numbers.
     * The 'F' suffix denotes a Float value.
     */
    val typeFloat: Float = 3.14F

    /**
     * Double: A 64-bit floating-point number, used for double-precision calculations.
     */
    val typeDouble: Double = 3.14159265358979

    /**
     * Char: Represents a single character.
     */
    val typeChar: Char = 'A'

    /**
     * Boolean: Represents a logical value, either true or false.
     */
    val typeBoolean: Boolean = true

    /**
     * String: Represents a sequence of characters (text).
     */
    val typeString: String = "Hello, Kotlin!"

    // Print basic data types
    println("Byte: $typeByte")
    println("Short: $typeShort")
    println("Int: $typeInt")
    println("Long: $typeLong")
    println("Float: $typeFloat")
    println("Double: $typeDouble")
    println("Char: $typeChar")
    println("Boolean: $typeBoolean")
    println("String: $typeString")

    // Nullable Type

    /**
     * Nullable String: In Kotlin, types can be nullable, meaning they can hold a null value.
     * The '?' operator indicates that the type can be null.
     */
    var nullableString: String? = "This can be null"
    println("Nullable String: $nullableString")

    // Assigning null to the nullable string
    nullableString = null
    println("Nullable String after null assignment: $nullableString")

    // Array

    /**
     * Array: Represents a collection of elements of a specified type.
     * Here, an array of integers is created.
     */
    val typeArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Array: ${typeArray.joinToString()}")

    // Immutable Collection

    /**
     * Immutable List: A read-only collection that cannot be modified after its creation.
     * This list holds a sequence of string elements.
     */
    val typeList: List<String> = listOf("Apple", "Banana", "Cherry")
    println("Immutable List: $typeList")

    // Mutable Collection

    /**
     * Mutable List: A collection that can be modified after its creation.
     * Here, elements can be added or removed from the list.
     */
    val typeMutableList: MutableList<String> = mutableListOf("Dog", "Cat", "Bird")

    // Adding an element to the mutable list
    typeMutableList.add("Fish")
    println("Mutable List after addition: $typeMutableList")

    // Map

    /**
     * Map: A collection of key-value pairs.
     * This example demonstrates a map where the keys are strings and the values are integers.
     */
    val typeMap: Map<String, Int> = mapOf("One" to 1, "Two" to 2, "Three" to 3)
    println("Map: $typeMap")

    // Function Type

    /**
     * Function Type: In Kotlin, functions are first-class citizens and can be assigned to variables.
     * This example demonstrates a simple lambda function that sums two integers.
     */
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println("Sum of 5 and 3 using function type: ${sum(5, 3)}")

    // Enum

    /**
     * Enum: A special data type that enables a variable to be a set of predefined constants.
     * Here, we define directions as an enum.
     */
    val direction: Direction = Direction.NORTH
    println("Enum Direction: $direction")

    // Sealed Class

    /**
     * Sealed Class: A special class that restricts the types that can subclass it.
     * This is used to represent restricted class hierarchies.
     * Here, we define a sealed class `Result` with two subclasses `Success` and `Failure`.
     */
    val result: Result = Success("Operation successful")

    // Using a when expression to handle different types of results
    val message = when (result) {
        is Success -> result.message
        is Failure -> result.error
    }
    println("Sealed Class Result: $message")
}

/**
 * Enum example to represent directions.
 */
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

/**
 * Sealed Class example to represent success and failure outcomes.
 */
sealed class Result
class Success(val message: String) : Result()
class Failure(val error: String) : Result()
