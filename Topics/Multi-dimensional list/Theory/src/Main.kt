// You can experiment here, it won’t be checked

fun main() {
    val deque = ArrayDeque<Int>()

    deque.addAll(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
    println(deque) // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    println(deque[2]) // 3
    println(deque.first()) // 1
    println(deque.last()) // 9
    println(deque)
    deque.clear()
    println(deque.firstOrNull()) // null
    println(deque.lastOrNull()) // null
    println(deque[50]) // exception java.lang.IndexOutOfBoundsException: Index: 50, Size: 9
}
