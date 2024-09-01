package programs.basic

fun main() {
    print("Enter first value : ")
    val firstValue = readln().toDouble()
    print("Enter second value : ")
    val secondValue = readln().toDouble()
    print("Select option to calculate(+,-,*,/,%) : ")
    val symbol = readln()
    val result: Double = when (symbol) {
        "+" -> firstValue + secondValue
        "-" -> firstValue - secondValue
        "*" -> firstValue * secondValue
        "/" -> firstValue / secondValue
        "%" -> firstValue % secondValue
        else -> 0.0
    }
    print("Calculation of given number : $result")
}

