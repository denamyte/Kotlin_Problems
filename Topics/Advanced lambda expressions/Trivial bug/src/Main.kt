class Solution {
    private val peaceWords = arrayOf("I","&&n",3,"love",1, "peace", "&&n")
    private val pattern = Regex("\\d+")
    val filteredPeaceWords = peaceWords.filter {
        if (pattern.matches(it.toString())) {
            return@filter true
        }
        it.toString() == "&&n"
    }
}