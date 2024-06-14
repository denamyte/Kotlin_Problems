fun main() = readln().run {
    println(
        last() +
            drop(1).take(length - 2) +
            first()
    )
}