import java.util.*

// "We need a main function, main is always the entry point for execution"
fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")

    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food.")
}

// Returns a String
fun randomDay() : String {
    val week = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}