inline fun <T, R>uniqueSelectors(list: List<T>, selector: (T) -> R): List<R> {
    return list.map(selector).distinct()
}