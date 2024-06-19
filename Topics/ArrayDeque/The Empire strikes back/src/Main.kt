data class Ship(val name: String, val ammunition: Int) {
    override fun toString(): String {
        return "$name-$ammunition"
    }
}

fun fixTheQueue(input: String): ArrayDeque<Ship> {
    // Convert input to list of ships
    val shipsList = input.split(" ").map {
        val parts = it.split("-")
        Ship(parts[0], parts[1].toInt())
    }

    return ArrayDeque<Ship>().also { it.addAll(shipsList.reversed()) }
}
