package basic.topic_19

/**
 * In Kotlin, type casting and smart casting are mechanisms used to convert one type to another and safely handle
 * types, especially when dealing with nullable types or polymorphism.
 */

fun main() {
    unSafeCasting()
    safeCasting()
    smartCasting()
}

/**
 * Type Casting is the process of converting one type into another explicitly.
 *
 * Unsafe Cast (as): This casts an object to the target type directly.
 * If the object cannot be cast to the target type, a ClassCastException is thrown.
 */

fun unSafeCasting() {
    val unSafeObj: Any = "Kotlin"
    val name: String = unSafeObj as String  // Works fine
    val age: Int = unSafeObj as Int  // Throws ClassCastException
}

/**
 * Safe Cast (as?): This attempts to cast the object to the target type, but returns null if the object is not
 * of the target type, preventing exceptions.
 */
fun safeCasting() {
    val obj: Any = "Kotlin"
    val surname: String? = obj as? String  // str = "Kotlin"
    val age: Int? = obj as? Int  // number = null
}

/**
 * Smart casting is Kotlin's ability to automatically cast a variable to a specific type if certain conditions are met.
 * This eliminates the need for explicit casting in many cases.
 *
 * Smart Casting with is: When you check a type using the is operator, Kotlin automatically casts the variable to
 * that type within the scope where the check was performed.
 */

fun smartCasting() {
    val obj : Any = "Kotlin"
    if (obj is String) {
        // No need to cast obj to String, Kotlin does it automatically
        println(obj.length)
    }
}