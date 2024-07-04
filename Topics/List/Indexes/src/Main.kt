fun solution(products: List<String>, product: String) =
    products.mapIndexed { i, s -> Pair(i, s) }
        .filter { it.second == product }
        .map { it.first }
        .joinToString(" ")
        .let(::println)
