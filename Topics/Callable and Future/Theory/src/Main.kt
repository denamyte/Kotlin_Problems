// You can experiment here, it won’t be checked

class NonGenericClass(val value: Any) {

    fun get(): Any {
        return value
    }
}
fun main() {
    val instance: NonGenericClass = NonGenericClass("Hello")

    val num: Int = instance.get() as Int
}
