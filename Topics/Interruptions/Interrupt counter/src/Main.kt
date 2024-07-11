class CounterThread : Thread() {
    override fun run() {
        var counter: Long = 0
        while (true) {
            counter++
            if (Thread.interrupted()) {
                println("It was interrupted")
                break
            }
        }
    }
}