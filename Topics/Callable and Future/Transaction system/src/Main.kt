import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun transactionSystem(transactions: List<Callable<Int>>): Int {
    val executor = Executors.newFixedThreadPool(4)

    val res = executor.invokeAll(transactions)
        .map { it.get() }
        .runningReduce { acc, value -> acc + value }
        .takeWhile { it >= 0 }
        .last()

    executor.shutdown()

    return res
}
