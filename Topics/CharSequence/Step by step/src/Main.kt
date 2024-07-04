fun removeEveryOtherChar(cs: CharSequence) = cs.filterIndexed { i, _ -> i % 2 == 0 }
