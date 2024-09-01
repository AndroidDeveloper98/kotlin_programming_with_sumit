package programs.basic

fun main() {
    val numbers = intArrayOf(1, 2, 3, 10, 24, 56, 100, 56, 78, 96, 38, 30, 38)
    var first = 0
    var second = 0
    var third = 0

    for (number in numbers) {
        if (number > first) {
            // Shift second to third, first to second, and set new first
            third = second
            second = first
            first = number
        } else if (number > second) {
            // Shift second to third and set new second
            third = second
            second = number
        } else if (number > third) {
            // Set new third
            third = number
        }
    }
    println("$first>$second>$third")
}