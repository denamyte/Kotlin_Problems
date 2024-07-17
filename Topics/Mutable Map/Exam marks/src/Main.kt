fun main() {
    val map = mutableMapOf<String, Int>()
    while (true) {
        val key = readln()
        if (key == "stop") break
        val value = readln().toInt()
        if (key !in map) {
            map[key] = value
        }
    }
    println(map)
}