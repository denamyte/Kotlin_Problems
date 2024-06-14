// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  printType("ljsadlfajsl")
  printType(12)
  printType(listOf("aaa"))
}

inline fun <reified T> printType(value: T) {
    println(value)
    println(T::class.qualifiedName)
}