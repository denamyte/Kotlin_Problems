import java.awt.Color

fun printColorFloat() = with(readln().split(" ").map(String::toInt)) {
        if (any { it !in 0..255 }) {
            println("Invalid input")
        } else {
            Color(get(0), get(1), get(2))
                .getColorComponents(null)
                .joinToString(" ")
                .let(::println)
        }
    }