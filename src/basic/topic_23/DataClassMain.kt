package basic.topic_23


/**
 * Kotlin’ s data classes are a powerful feature that simplifies the creation of classes whose primary purpose is to hold data.
 * They automatically provide several boilerplate methods and functionality that you’d typically need to implement yourself
 * in other languages. Here’s a detailed overview of Kotlin data classes,
 * their features, and how to use them effectively.
 */

fun main() {
    // Normal class
    // Creating two instances of UserClass with the same data
    val userClass1 = UserClass(name = "Virat", emailAddress = "virat@gmail.com")
    val userClass2 = UserClass(name = "Virat", emailAddress = "virat@gmail.com")

    // Comparing the two instances
    // Since UserClass is a regular class, the '==' operator compares the references, not the content
    if (userClass1 == userClass2) {
        println("Both user class same")  // This block won't be executed because the references are different
    } else {
        println("Both user class not same")  // This block will be executed
    }

    // Data class
    // Creating two instances of UserDataClass with the same data
    val userDataClass1 = UserDataClass(name = "Virat", emailAddress = "virat@gmail.com")
    val userDataClass2 = UserDataClass(name = "Virat", emailAddress = "virat@gmail.com")

    // Comparing the two instances
    // Since UserDataClass is a data class, the '==' operator compares the content of the instances
    if (userDataClass1 == userDataClass2) {
        println("Both user data class same")  // This block will be executed because the content is the same
    } else {
        println("Both user data class not same")
    }
}

class UserClass(val name: String,emailAddress: String){

}

data class UserDataClass(val name : String,val emailAddress : String){

}