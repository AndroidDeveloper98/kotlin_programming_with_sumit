package basic.topic_2

/**
 * When an identifier holds data, you must decide whether it can be
 * reassigned.
 */
fun main() {
    /**
     * val, short for value, which means you can only initialize it; you cannot
     * reassign it.
     */
    val playerName = "Virat Kholi";
    val score = 100;
    println(playerName)
    println(score)

    /**
     * var, short for variable, which means you can reassign its contents.
     */
    var captainName = "Rohit Sharma"
    println(captainName)
    captainName = "Virat Kholi"
    println(captainName)

}