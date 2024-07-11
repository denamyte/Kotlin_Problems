import java.util.concurrent.Callable

fun determineCallableDepth(callable: Callable<*>): Int {
    var c: Any = callable
    var sum = 0
    while (c is Callable<*>) {
        sum++
        c = c.call()
    }
    return sum
}