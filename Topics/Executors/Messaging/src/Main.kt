import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

/* Do not change this class */
data class Message(val from: String, val to: String, val text: String)

/* Do not change this interface */
interface AsyncMessageSender {
    fun sendMessages(messages: List<Message>)
    fun stop()
}

class AsyncMessageSenderImpl(val repeatFactor: Int) : AsyncMessageSender {
    val executor: ExecutorService = Executors.newFixedThreadPool(2)

    override fun sendMessages(messages: List<Message>) {
        for (msg in messages) {
            for (i in 1..repeatFactor) {
                executor.submit {
                    println("(${msg.from}>${msg.to}): ${msg.text}") // do not change it
                }
            }
        }
    }

    override fun stop() {
        executor.shutdown()
        executor.awaitTermination(50, TimeUnit.MILLISECONDS)
    }
}
