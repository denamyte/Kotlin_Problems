inline fun <reified T>filterByType(list: List<Any>): List<T> {
    return list.filterIsInstance(T::class.java)
}
