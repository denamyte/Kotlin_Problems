//    class Android(val id: Int, val energy: Int)

fun calculateTotalEnergy(androids: List<Android>): Int {
    var totalEnergy = 0

    require(androids.isNotEmpty()) { "List of androids cannot be empty" }

    for (android in androids) {
        check(android.energy >= 0) { "Android energy must be greater than or equal to zero" }
        totalEnergy += android.energy
    }

    return totalEnergy
}

//    fun main() {
//        listOf(
//            Android(123, 20),
//            Android(234, 30),
//            Android(345, 40),
//        ).run {
//            calculateTotalEnergy(this)
//        }.let(::println)
//    }