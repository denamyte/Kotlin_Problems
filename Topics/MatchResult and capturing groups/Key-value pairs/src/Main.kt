fun printMap(regex: Regex, input: String) {
    regex.findAll(input)
        .map {
            val (key, value) = it.destructured
            key to value
        }
        .toMap()
        .let(::println)
}