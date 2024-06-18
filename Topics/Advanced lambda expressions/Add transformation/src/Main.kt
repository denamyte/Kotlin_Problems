class Solution {
    fun applyTransformation(nums: List<Int>, tr: (Int) -> Int) = nums.map(tr)
}

//    fun main() {
//        val nums = listOf(1, 2, 3)
//        val incF = { a: Int -> a + 1 }
//        val trNums = Solution().applyTransformation(nums, incF)
//        println(trNums)  // [2, 3, 4]
//    }