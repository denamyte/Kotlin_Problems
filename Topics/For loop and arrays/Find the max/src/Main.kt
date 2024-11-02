fun main() = List(readln().toInt()) { readln().toInt() }
    .run { indexOf(max()) }
    .let(::println)