package basic.topic_20

fun main() {
    val publicModifiers = PublicModifiers()
    publicModifiers.greetingMessage = "Hello, Kotlin"
    publicModifiers.greeting()
}

class PublicModifiers(){
    var greetingMessage = "Hello, Good Morning..."
    fun greeting(){
        println(greetingMessage)
    }
}