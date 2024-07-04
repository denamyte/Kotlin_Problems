fun containsOnlyAlphabets(cs: CharSequence) =
    cs.toString().matches("[a-z]+$".toRegex(RegexOption.IGNORE_CASE))
