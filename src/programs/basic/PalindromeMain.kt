package programs.basic

/**
 * A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
 * (ignoring spaces, punctuation, and capitalization). For example, the word "radar" is a palindrome because it
 * reads the same in both directions. Palindromes can also be sentences, like "A man, a plan, a canal, Panama!"
 *
 * Words: "level," "madam," "racecar"
 * Phrases: "A Santa lived as a devil at NASA," "Able was I ere I saw Elba"
 * Numbers: 121, 1331, 12321
 *
 * abcba
 *
 */

fun main() {
    // Read input from the user, convert it to lowercase, and remove spaces
    val palindrome = readln().lowercase().replace(" ", "")

    // Get the length of the processed string
    val textLength = palindrome.length

    // Calculate the number of iterations needed (half of the string length)
    val iteration = textLength / 2

    // Initialize empty strings to hold the first and last parts of the palindrome
    var firstPart = ""
    var lastPart = ""

    // Build the first half of the palindrome
    for (i in 0 until iteration) {
        firstPart += palindrome[i].toString()
    }

    // Build the second half of the palindrome (in reverse order)
    for (i in textLength - 1 downTo textLength - iteration) {
        lastPart += palindrome[i].toString()
    }

    // Print the first and last parts
    println(firstPart)
    println(lastPart)

    // Check if the first and last parts are equal
    if (firstPart == lastPart) {
        println("This is palindrome")
    }

    // Alternative approach to check if the string is a palindrome
    if (palindrome == palindrome.reversed()) {
        println("This is palindrome")
    }
}