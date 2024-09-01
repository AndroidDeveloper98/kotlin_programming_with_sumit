package programs.easy

fun main() {
    println("===========Star triangle============")
    for (i in 0..7) {
        for (j in 0..i) {
            print(" * ")
        }
        println()
    }
    println("===========Star triangle============")
    println()
    println("===========Star Pyramid============")
    for(i in 0..<7){
        for(j in 0..<7-i){
            print(" ")
        }
        for(k in 0..<i){
            print("* ")
        }
        println()
    }
    println("===========Star Pyramid============")
}