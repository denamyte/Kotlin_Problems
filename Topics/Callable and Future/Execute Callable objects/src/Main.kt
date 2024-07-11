import java.util.concurrent.*

fun executeCallableObjects(items: List<Future<Callable<Int>>>) =
    items.reversed().sumOf { it.get().call() }