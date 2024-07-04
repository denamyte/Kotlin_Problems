fun solution(elements: MutableList<String>, index: Int) =
    elements.also { it.removeAt(index) }
