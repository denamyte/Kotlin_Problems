fun isPalindrome(str: CharSequence) =
    with(str.toString()) { this == reversed() }