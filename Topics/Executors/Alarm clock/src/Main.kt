import java.util.concurrent.*

// do not change this code
val executor: ScheduledExecutorService = Executors.newSingleThreadScheduledExecutor()

fun alarm() {
    println("It's time to get up!")
    var sec = 0
    executor.scheduleAtFixedRate(
        {
            sec++
            println("You overslept by $sec seconds, it's time to get up!")
            if (sec == 5) executor.shutdown()
        },
        1000,
        1000,
        TimeUnit.MILLISECONDS
    )
}
