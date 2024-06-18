fun interface NumberPredicate {
    fun accept(n: Int): Boolean
}

fun main() = NumberPredicate { n -> n % 2 == 0 }
    .let { pred ->
        readln().split(" ")
            .map(String::toInt)
            .filter(pred::accept)
            .joinToString(" ")
            .let(::println)
    }