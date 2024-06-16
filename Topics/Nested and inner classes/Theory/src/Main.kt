// You can experiment here, it won’t be checked

fun main() {
    val al = arrayListOf(1, 2, 3)
    al.removeAll(listOf(1, 2))
    al.retainAll(listOf(1, 2))
}