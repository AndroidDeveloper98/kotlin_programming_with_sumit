package oops_concept.inheritance

/**
 * In Kotlin, inheritance allows a class to inherit properties and methods from another class.
 * Kotlin supports various types of inheritance,each serving different purposes.
 * Here’s an overview of the types of inheritance in Kotlin:
 *
 * Type of inheritance
 *
 * Single
 * Multiple
 * MultiLevel
 * Hybrid (Combination of two and more inheritance).
 * Hierarchical
 */


/**
 * Single inheritance is the most common form of inheritance, where a class inherits from one base class.
 */

// Parent class declaration with an open method that can be overridden by child classes
open class SuperClass {
    // Open method that prints a greeting message, allowing subclasses to override it
    open fun greeting() {
        println("Hello, Good Morning")
    }
}

// Child class that inherits from SuperClass (single inheritance)
class BaseClass : SuperClass() {
    // Overriding the greeting method from the SuperClass
    override fun greeting() {
        // Prints a different greeting message specific to the BaseClass
        println("Hello, World")
    }
}

/**
 * Kotlin does not support multiple inheritance of classes directly
 * but supports multiple inheritance through interfaces.
 * A class can implement multiple interfaces.
 */

// Interface 1: Defines a contract for flying behavior
interface Flyer {
    // Abstract function that must be implemented by any class that implements this interface
    fun fly()
}

// Interface 2: Defines a contract for swimming behavior
interface Swimmer {
    // Abstract function that must be implemented by any class that implements this interface
    fun swim()
}

// Class implementing multiple interfaces
class Duck : Flyer, Swimmer {
    // Implementation of the 'fly' method from the 'Flyer' interface
    override fun fly() {
        println("Duck flies") // Prints that the duck is flying
    }

    // Implementation of the 'swim' method from the 'Swimmer' interface
    override fun swim() {
        println("Duck swims") // Prints that the duck is swimming
    }
}

/**
 * Multilevel inheritance is a type of inheritance in object-oriented programming where
 * a class is derived from another class, which in turn is derived from a third class.
 * In this hierarchical chain, each class inherits the properties and behaviors of its predecessor,
 * allowing for the reuse and extension of code across multiple levels of classes.
 */

// Base class (Parent class)
open class CricketPlayer {
    open fun play() {
        println("Cricket player is playing")
    }
}

// Derived class from CricketPlayer (Child class)
open class BatsmanPlayer : CricketPlayer() {
    override fun play() {
        println("Batsman is batting")
    }

    fun scoreRuns() {
        println("Batsman scores runs")
    }
}

// Derived class from Batsman (Grandchild class)
class OpeningBatsman : BatsmanPlayer() {
    override fun play() {
        println("Opening batsman is starting the innings")
    }

    fun faceNewBall() {
        println("Opening batsman faces the new ball")
    }
}

/**
 * Hierarchical inheritance is a type of inheritance where multiple classes inherit
 * from a single base (parent) class. This allows different derived (child) classes
 * to inherit common properties and behaviors from the same parent class.
 */


// Base class representing a general cricket player
open class CricketPlayerBase(val name: String, val age: Int, val team: String) {

    // Method to introduce the player, common to all cricket players
    fun introduce() {
        println("I am $name, $age years old, playing for $team.")
    }

    // Open method for defining the player's role, intended to be overridden by subclasses
    open fun role() {
        println("$name is a cricket player.")
    }
}

// Class representing a Batsman, inherits from CricketPlayerBase
class Batsman(name: String, age: Int, team: String, val runsScored: Int) : CricketPlayerBase(name, age, team) {

    // Overriding the role method to specify that this player is a Batsman
    override fun role() {
        println("$name is a Batsman with $runsScored runs scored.")
    }

    // Specific method for a Batsman to perform the action of batting
    fun bat() {
        println("$name is batting.")
    }
}

// Class representing a Bowler, inherits from CricketPlayerBase
class Bowler(name: String, age: Int, team: String, val wicketsTaken: Int) : CricketPlayerBase(name, age, team) {

    // Overriding the role method to specify that this player is a Bowler
    override fun role() {
        println("$name is a Bowler with $wicketsTaken wickets taken.")
    }

    // Specific method for a Bowler to perform the action of bowling
    fun bowl() {
        println("$name is bowling.")
    }
}

// Class representing an All-Rounder, inherits from CricketPlayerBase
class AllRounder(name: String, age: Int, team: String, val runsScored: Int, val wicketsTaken: Int) : CricketPlayerBase(name, age, team) {

    // Overriding the role method to specify that this player is an All-Rounder
    override fun role() {
        println("$name is an All-Rounder with $runsScored runs scored and $wicketsTaken wickets taken.")
    }

    // Specific method for an All-Rounder to perform the action of batting
    fun bat() {
        println("$name is batting.")
    }

    // Specific method for an All-Rounder to perform the action of bowling
    fun bowl() {
        println("$name is bowling.")
    }
}


fun main() {
    // Creating an instance of the BaseClass
    val baseClass = BaseClass()
    // Calling the overridden greeting method of BaseClass
    baseClass.greeting()

    val duck = Duck()
    duck.fly() // Output: Duck flies
    duck.swim() // Output: Duck swims

    val opener = OpeningBatsman()
    // Accessing properties and functions from all classes in the hierarchy
    opener.play()        // Opening batsman is starting the innings
    opener.scoreRuns()   // Batsman scores runs
    opener.faceNewBall() // Opening batsman faces the new ball


    val batsman = Batsman("Virat Kohli", 35, "India", 12000)
    batsman.introduce()
    batsman.role()
    batsman.bat()

    val bowler = Bowler("Jasprit Bumrah", 30, "India", 250)
    bowler.introduce()
    bowler.role()
    bowler.bowl()

    val allRounder = AllRounder("Ben Stokes", 33, "England", 5000, 150)
    allRounder.introduce()
    allRounder.role()
    allRounder.bat()
    allRounder.bowl()

}
