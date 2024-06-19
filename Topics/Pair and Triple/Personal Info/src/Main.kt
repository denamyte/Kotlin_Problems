fun main() = readln().split(" ")
    .run { Pair(get(0), get(1).toInt()) }
    .let(::println)