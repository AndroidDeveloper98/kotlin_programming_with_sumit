package basic.topic_22

import java.util.Objects

/**
 * A Companion Object is an object that’s tied to a class, and has access to its private members.
 * It’s like a regular object, but it’s associated with a specific class. To define a Companion Object,
 * you use the companion object keyword.
 *
 *
 * An Object Expression is a way to create an anonymous object that’s similar to a regular object,
 * but doesn’t have a named class. One use case for Object Expressions is implementing an interface as an Object.
 *
 */
fun main() {
    UserProfile.USER_NAME
    // Object expression
    val updateProfile = object : UpdateProfile{
        override fun updateProfile() {
            println("Updated user profile.")
        }
    }
    updateProfile.updateProfile()
    MySingleton.instance.doSomething()
}

interface UpdateProfile {
    fun updateProfile()
}

/**
 * In this example, we’ve defined a class called MySingleton with a private constructor.
 * We've also defined a Companion Object that has a lazy property called instance.
 * This lazy property creates a single instance of MySingleton and provides global access to it.
 *
 * Whenever we want to call the doSomething() method, we can do so using the MySingleton.instance instance, like this:
 */

class MySingleton private constructor() {
    companion object {
        val instance: MySingleton by lazy { MySingleton() }
    }

    fun doSomething() {
        println("Hello from MySingleton!")
    }
}

class UserProfile(){
    companion object {
        const val USER_NAME = "Rohit Sharma"
    }
}