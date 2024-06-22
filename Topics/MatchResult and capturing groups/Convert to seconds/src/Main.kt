fun convertToSeconds(durations: List<String>, regex: Regex) {
    val factors = listOf(3600, 60, 1)
    durations.map { time ->
        regex.find(time)?.run {
            destructured.toList().map(String::toInt)
                .zip(factors)
                .sumOf { it.first * it.second }
                .let(::println)
        }
    }
}