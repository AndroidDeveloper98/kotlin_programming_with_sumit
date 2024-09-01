package oops_concept.encapsulation

/**
 *
 * Encapsulation is the technique of hiding the internal state and requiring all interactions to be performed
 * through an object’s methods. This is typically achieved by making fields private and providing public
 * getter and setter methods. Encapsulation helps in safeguarding the data and improving the modularity
 * and maintainability of the code.
 *
 * This class represents a Book with encapsulated properties.
 * Encapsulation is achieved by making fields private and
 * providing public methods to interact with them.
 */
class Book(private val title: String, private val author: String) {

    // Internal state to track the availability of the book.
    private var isAvailable: Boolean = true

    // Public method to get the title of the book.
    fun getTitle(): String {
        return title
    }

    // Public method to get the author of the book.
    fun getAuthor(): String {
        return author
    }

    // Public method to check if the book is available for borrowing.
    fun isAvailable(): Boolean {
        return isAvailable
    }

    /**
     * Public method to borrow the book.
     * Returns true if the book is successfully borrowed, otherwise false.
     */
    fun borrowBook(): Boolean {
        return if (isAvailable) {
            // If the book is available, mark it as not available and return true.
            isAvailable = false
            true
        } else {
            // If the book is not available, return false.
            false
        }
    }

    /**
     * Public method to return the book.
     * Marks the book as available.
     */
    fun returnBook() {
        isAvailable = true
    }
}

fun main() {
    // Creating an instance of the Book class.
    val book1 = Book("1984", "George Orwell")

    // Displaying the book's title and author using getter methods.
    println("Book: ${book1.getTitle()} by ${book1.getAuthor()}")

    // Checking and displaying the availability of the book.
    println("Is Available: ${book1.isAvailable()}")

    // Attempting to borrow the book.
    val borrowed = book1.borrowBook()
    if (borrowed) {
        println("Successfully borrowed the book.")
    } else {
        println("Book is not available.")
    }

    // Checking and displaying the availability after borrowing.
    println("Is Available after borrowing: ${book1.isAvailable()}")

    // Returning the book.
    book1.returnBook()

    // Checking and displaying the availability after returning.
    println("Is Available after returning: ${book1.isAvailable()}")
}

/**
 * In this example, the title, author, and availability status of a book are encapsulated within the Book class.
 * These fields are private, and public methods (getTitle, getAuthor, isAvailable, borrowBook, returnBook) provide
 * controlled access.
 */
