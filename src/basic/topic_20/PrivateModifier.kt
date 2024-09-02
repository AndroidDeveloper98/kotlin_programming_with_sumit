package basic.topic_20

fun main() {
    val privateModifier = PrivateModifier()
    //privateModifier.greetingMessage //Not access value here because private scope only with it's class.
    privateModifier.greeting()

}

class PrivateModifier(){
    private var greetingMessage = "Hello, Good Morning..."
    fun greeting(){
        println(greetingMessage)
    }
}