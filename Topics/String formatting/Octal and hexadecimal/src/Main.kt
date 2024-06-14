// AI Instructions:
//    The function printOctAndHex(value: Int) gets an Int number
//    and prints this number in its octal and hexadecimal format
//    separated by a single space. Use string format modifiers.
//    The octal number should have a leading 0, while the hexadecimal
//    number should have a leading 0x.

fun printOctAndHex(value: Int) {
    println("%#o %#x".format(value, value))
}
