fun isReversed(pair: Pair<String, String>) =
    with(pair) { Triple(first, second, (first.lowercase() == second.lowercase()).toString()) }
