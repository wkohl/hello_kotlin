import java.util.*

// "We need a main function, main is always the entry point for execution"
fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")

    var dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println(dayOfWeek)

    when (dayOfWeek) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }
}