fun interface Operation {
    fun execute(x: Int, y: Int): Int
}

fun performOperation(a: Int, b: Int, op: Operation) = op.execute(a, b)

// fun main() = performOperation(1, 2) { x, y -> x + y }
//     .let(::println)