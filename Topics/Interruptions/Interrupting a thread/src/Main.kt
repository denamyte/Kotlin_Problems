import java.lang.Thread.sleep
val mainThreadId = Thread.currentThread().id

fun main() {
    val worker = Worker()

    worker.start()
    sleep(2500)
    worker.interrupt()
    worker.join()
}

// Don't change the code below
class Worker : Thread() {
    override fun run() {
        try {
            sleep(1000L)
        } catch (e: InterruptedException) {
            throw RuntimeException("You need to wait longer!", e)
        }
        val currentId = currentThread().id
        if (currentId == mainThreadId) {
            throw RuntimeException("You must start a new thread!")
        }
        while (true) {
            if (isInterrupted) {
                println("Interrupted")
                break
            }
        }
    }
}