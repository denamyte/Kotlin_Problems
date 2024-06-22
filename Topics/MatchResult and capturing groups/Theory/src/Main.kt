// You can experiment here, it won’t be checked

fun main() {
    val match = Regex("""(\w+) (\d+)""").find("A 01-B 02")!!
//    println(match.groupValues[0])
    println(match.value)
}
