import java.util.*

class Ship(val name: String, val ammunition: Int) {
    override fun toString() = "$name-$ammunition"
}

fun main() {
    val stack = Stack<Ship>()
    readln().split(" ")
        .map { it.split("-") }
        .map { Ship(it[0], it[1].toInt()) }
        .forEach(stack::push)
    val seq = sequence<Ship> { while (stack.isNotEmpty()) yield(stack.pop()) }
    println(seq.joinToString(prefix = "[", postfix = "]"))
}