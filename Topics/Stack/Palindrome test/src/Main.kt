import java.util.*

fun checkPalindrome(word: String): Boolean {
    val stack = Stack<Char>()
    word.forEach(stack::push)
    for (c in word) if (c != stack.pop()) return false
    return true
}

fun main() {
    println(checkPalindrome(readln()))
}