package basic.topic_20


fun main() {
    val greeting = Greeting()
    greeting.showMessage()
}

class Greeting : ProtectedModifier(){
    fun showMessage(){
        greetingMessage = "Hello , Kotlin"
        greeting()
    }
}

open class ProtectedModifier {
    protected var greetingMessage = "Hello, Good Morning..."
    protected fun greeting(){
        println(greetingMessage)
    }
}