import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun transactionSystem(transactions: List<Callable<Int>>): Int {
    val executor = Executors.newFixedThreadPool(4)

    // write your code here

    executor.shutdown()
}