// You can experiment here, it won’t be checked

inline fun <reified T>filterByType(list: List<Any>): List<T> {
    return list.filterIsInstance(T::class.java)
}

fun main() {
    val anyList = listOf("aaa", "bbb", 1, 2, 'c', 'd', "eee")
    val filtered: List<String> = filterByType(anyList)
    println(filtered)
}
