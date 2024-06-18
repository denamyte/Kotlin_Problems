// import java.util.logging.Level

fun main() = readln().split(" ")
    .map(String::uppercase)
    .map(Level::parse)
    .map(Level::intValue)
    .sum()
    .let(::println)