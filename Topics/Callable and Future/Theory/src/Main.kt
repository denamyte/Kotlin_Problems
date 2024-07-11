import java.util.concurrent.*

fun main() {
    val executor = Executors.newFixedThreadPool(4)

    val callables = listOf(
        Callable { 10 },
        Callable { 20 },
        Callable { 30 }
    )

    val result = executor.invokeAny(callables)

    executor.shutdown()
}
