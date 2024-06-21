fun main() {
    val (a, b) = List(2) { readln().toBigInteger() }
    println(a * b / a.gcd(b))
}