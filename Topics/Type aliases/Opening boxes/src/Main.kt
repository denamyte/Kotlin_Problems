class BiggerBox {
    class InnerBox<T>(var items: List<T>) {
        fun getSomethingFromBox(): List<T> {
            return items
        }
    }
}

typealias Box<T> = BiggerBox.InnerBox<T>

fun main() = println(Box(listOf("lion", "rose")).getSomethingFromBox().size)