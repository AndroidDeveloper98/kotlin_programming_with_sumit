package util

import basic.topic_20.ProtectedModifier

fun main() {
    val internalModifierUtil = InternalModifierUtil()
    internalModifierUtil.greetingUtil()
}

class InternalModifierUtil : ProtectedModifier() {
    internal var greetingMessageUtil = "Hello, Good Morning..."
    internal fun greetingUtil(){
        println(greetingMessageUtil)
        greeting()
    }
}