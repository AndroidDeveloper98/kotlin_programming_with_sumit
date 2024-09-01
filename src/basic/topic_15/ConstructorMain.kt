package basic.topic_15

/**
 * In Kotlin, constructors are used to initialize objects when they are created.
 * There are two types of constructors: primary constructors and secondary constructors.
 *
 * Primary Constructor
 * The primary constructor is part of the class header and is used to initialize properties of the class.
 * It is declared directly in the class header and can be used to initialize properties and perform setup tasks.
 *
 * Secondary Constructor
 * A class can also have one or more secondary constructors, which are defined inside the class body.
 * These constructors provide additional ways to create instances of the class, often with different
 * sets of parameters.
 */
class Book(val title: String, val author: String) {

    // Secondary constructor that provides an alternative way to initialize a `Book` with only a title.
    constructor(title: String) : this(title, "Unknown") {
        println("Book created with title only. Author set to 'Unknown'.")
    }

    /**
     * Method to display book details.
     */
    fun displayDetails() {
        println("Title: $title, Author: $author")
    }
}

fun main() {
    // Create a `Book` instance using the primary constructor.
    val book1 = Book("Kotlin Programming", "John Doe")
    book1.displayDetails() // Output: Title: Kotlin Programming, Author: John Doe

    // Create a `Book` instance using the secondary constructor.
    val book2 = Book("Learning Kotlin")
    book2.displayDetails() // Output: Title: Learning Kotlin, Author: Unknown
}
