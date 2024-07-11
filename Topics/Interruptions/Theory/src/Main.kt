// You can experiment here, it won’t be checked

import java.util.concurrent.*


fun main() {
    val executor = Executors.newFixedThreadPool(4)

    val future1 = executor.submit(
        Callable {
            TimeUnit.SECONDS.sleep(5)
            700000
        }
    )

    val future2 = executor.submit(
        Callable {
            TimeUnit.SECONDS.sleep(5)
            900000
        }
    )

    val result = future1.get() + future2.get() // waiting for both results

    println(result) // 1600000
}


