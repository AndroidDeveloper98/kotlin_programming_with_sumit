package programs.easy

/**
 * Program to reverse string.
 */
fun main() {
    print("Enter name to reverse : ")
    val name = readln()
    var result = ""
    name.forEachIndexed { index, c ->
        result += name[name.length-1-index]
    }
    println("Reversed name : $result")
}