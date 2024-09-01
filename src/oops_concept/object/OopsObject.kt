package oops_concept.`object`

/**
 * An object is an instance of a class that has a state, which is the values of all its properties.
 * Objects can correspond to real-world objects or abstract entities.
 *
 * The `Configuration` object holds global configuration details for the application.
 * It is a singleton, meaning only one instance of it exists throughout the application.
 */
object Configuration {
    // Attributes represent the state of an object, and are the characteristics that distinguish classes.
    var appName: String = "MyApp"
    var version: String = "1.0.0"

    /**
     * Methods are functions that objects can perform. This method displays the application's configuration details.
     */
    fun displayConfig() {
        println("App Name: $appName")
        println("Version: $version")
    }
}

fun main() {
    // Access properties and methods of the `Configuration` object directly.
    Configuration.appName = "OopsApp"
    Configuration.version = "1.1.0"

    // Display configuration details.
    Configuration.displayConfig()
    // Output:
    // App Name: UpdatedApp
    // Version: 1.1.0
}