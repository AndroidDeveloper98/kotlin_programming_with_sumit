package basic.topic_21


/**
 * Kotlin, the keyword object is used to define a singleton object.
 * A singleton object is an object that can only have one instance throughout the entire application.
 * This means that if you create a singleton object in one part of your application,
 * you can access that same instance from anywhere else in your application.
 */
fun main() {
  Logger.log("Hello")
}

object Logger {
    fun log(message: String) {
       println(message)
    }
}