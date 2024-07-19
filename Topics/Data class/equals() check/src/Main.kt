data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        return other is Client && name == other.name && age == other.age
    }

    override fun hashCode() = 31 * name.hashCode() + age
}

fun main() = { Client(readln(), readln().toInt(), readln().toInt()) }
    .let { read -> println(read() == read()) }