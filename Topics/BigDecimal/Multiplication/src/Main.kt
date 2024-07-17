import java.math.BigDecimal

fun main() {
    fun bd() = readln().toBigDecimal()
    println(bd() * bd())
}