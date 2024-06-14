// correct the code below
@Suppress("UNCHECKED_CAST")
inline fun <reified T>filterNonNullValues(list: List<Any?>): List<T> {
    return list.filterNotNull() as List<T>
}
//
//fun main() {
//    println(filterNonNullValues(listOf(1, 2, null)))
//}