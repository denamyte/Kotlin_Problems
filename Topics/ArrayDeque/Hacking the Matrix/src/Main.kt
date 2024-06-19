fun main() = with(ArrayDeque(readln().split(" "))) {
    while (isNotEmpty()) {
        print("${removeFirst()} ")
        if (isNotEmpty()) print("${removeLast()} ")
    }
}