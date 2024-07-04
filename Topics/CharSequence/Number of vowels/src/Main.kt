fun countVowels(cs: CharSequence) =
    cs.filter { it in "aeiouy" }.length
