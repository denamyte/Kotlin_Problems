fun sum(p1: Pair<Int, Int>, p2: Pair<Int, Int>) =
    p1.first + p2.first to p1.second + p2.second

fun main() {
    fun pair() = readln().split(" ")
        .map(String::toInt)
        .run { get(0) to get(1) }

    println(sum(pair(), pair()))
}