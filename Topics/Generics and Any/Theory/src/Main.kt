// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    val instance = MyClass("Hello!")
}

class MyClass<T>(val t: T) {

    fun get(): T {
        return t
    }
}