// You can experiment here, it won’t be checked

val lazyValue: String by lazy {
    print("Computed! ")
    "Hello"
}

fun main() {
    println(lazyValue) // Computed! Hello
    println(lazyValue) // Hello
}
