import java.util.concurrent.*

fun main() {
    val executor = Executors.newFixedThreadPool(4)
    val numbers: List<Int> = readln().split(" ").map(String::toInt)
    for (number in numbers) {
        executor.submit(PrintIfPrimeTask(number))
    }
    executor.shutdown()
}

class PrintIfPrimeTask(private val n: Int) : Runnable {
    override fun run() {
        if (n < 2) return
        for (i in 2..n / 2) if (n % i == 0) return
        println(n)
    }
}