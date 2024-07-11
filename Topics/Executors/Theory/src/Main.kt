// You can experiment here, it won’t be checked

fun main() {
    val thread = thread(start = false, block = {
        if (!Thread.interrupted()) {
            println(Thread.interrupted())
        } else {
            while (true) {
                if (!Thread.interrupted()) {
                    println(Thread.interrupted())
                    break
                }
            }
        }
    })
    thread.start()
    thread.interrupt()
}

fun thread(
    start: Boolean,
    block: () -> Unit
): Thread {
    val thread = object : Thread() {
        override fun run() {
            block()
        }
    }
    return thread
}