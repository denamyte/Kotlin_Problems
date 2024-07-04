fun main() = with(List(readln().toInt()) { readln() }) {
    listOf(first(), last())
}.forEach { println("${it.first()} ${it.last()}") }