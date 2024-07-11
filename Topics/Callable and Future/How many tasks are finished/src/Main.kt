import java.util.*
import java.util.concurrent.*

fun howManyIsDone(items: List<Future<Int>>) =
    items.filter { it.isDone || it.isCancelled }.size