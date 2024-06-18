class Solution {
    fun bigFunction(value: Int, f: (Int, Int) -> Int): (Int) -> Int {
        return { i -> f(value, i) }
    }
}

// fun main() {
//     val f = {x: Int, y: Int -> x + y}
//     val tr = Solution().bigFunction(5, f)
//
//     println(tr(10))  // 15
// }