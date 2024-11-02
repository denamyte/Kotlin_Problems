import java.util.Scanner

private const val defaultCount = 2

fun main() = with(Scanner(System.`in`)) {
    val rooms = nextInt()
    val count = if (hasNext()) nextInt() else defaultCount
    println(rooms * count)
}