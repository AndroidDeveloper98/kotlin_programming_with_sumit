package programs.easy

// Main function: entry point of the program
fun main() {
    // Prompt the user to enter a number
    print("Enter number : ")

    // Read the user input as a string, convert it to an integer
    val number = readln().toInt()

    // Check if the number is a prime number using the isPrime function
    if (isPrime(number)) {
        // If the number is prime, print this message
        println("$number is a prime number.")
    } else {
        // If the number is not prime, print this message
        println("$number is not a prime number.")
    }
}

// Function to determine if a number is prime
fun isPrime(n: Int): Boolean {
    // Numbers less than or equal to 1 are not prime
    if (n <= 1) return false

    // 2 and 3 are prime numbers
    if (n <= 3) return true

    // Eliminate numbers divisible by 2 or 3
    if (n % 2 == 0 || n % 3 == 0) return false

    // Check divisibility from 5 upwards, skipping even numbers and multiples of 3
    var i = 5
    while (i * i <= n) {
        // If n is divisible by i or (i + 2), it's not prime
        if (n % i == 0 || n % (i + 2) == 0) return false
        // Increment i by 6 to check the next possible divisors (6k ± 1)
        i += 6
    }

    // If no divisors were found, the number is prime
    return true
}
