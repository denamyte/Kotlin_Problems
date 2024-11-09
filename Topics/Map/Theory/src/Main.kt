fun calculatePartyTotalCost(
    guests: Int,
    cost: Int,
    decoration: Int?
) = guests * cost + (decoration ?: 0)

fun main() = calculatePartyTotalCost(
    readln().toInt(),
    readln().toInt(),
    readlnOrNull()?.toIntOrNull()
).let { println("Total cost: $it") }