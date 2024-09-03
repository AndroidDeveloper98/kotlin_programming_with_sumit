package basic.topic_20

import util.InternalModifierUtil

fun main() {
    val internalModifier = InternalModifier() //This class belong same.
    internalModifier.greetingMessage = "Hello, Kotlin"
    internalModifier.greeting()

    val internalModifierUtil = InternalModifierUtil() // This class also belong same module.
    internalModifierUtil.greetingMessageUtil = "Hello, Util"
    internalModifierUtil.greetingUtil()
}

class InternalModifier(){
    internal var greetingMessage = "Hello, Good Morning..."
    internal fun greeting(){
        println(greetingMessage)
    }
}