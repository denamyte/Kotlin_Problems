//import java.awt.Color

fun printColorInt() = with(readln().split(" ").map(String::toFloat)) {
    if (any { it < 0 || it > 1 }) {
        println("Invalid input")
    } else with(Color(get(0), get(1), get(2))) {
        listOf(red, green, blue)
            .joinToString(" ")
            .let(::println)
    }
}