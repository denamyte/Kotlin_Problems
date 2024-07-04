// You can experiment here, it won’t be checked

fun isPalindrome(str: CharSequence): Boolean {
    return with(str.toString()) { this == reversed() }
}

fun main() {
    val result = "welcomeToKotlin".substring(7, 13)
    println(result)
}
