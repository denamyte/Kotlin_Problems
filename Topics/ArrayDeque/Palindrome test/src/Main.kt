fun isPalindrome(word: String): Boolean {
    val deque = ArrayDeque<Char>()

    for (char in word) {
        deque.addLast(char)
    }

    with(deque) {
        while (size > 1)
            if (removeFirst() != removeLast()) return false
    }

    return true
}
