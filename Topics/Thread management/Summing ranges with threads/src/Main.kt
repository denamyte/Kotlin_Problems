fun main() {
    fun readAndStart(): RangeSummator {
        val (a, b) = readln().split(" ").map { it.toInt() }
        val sum = RangeSummator(a, b)
        return sum
    }
    List(2) { readAndStart() }
        .onEach(RangeSummator::start)
        .onEach(RangeSummator::join)
        .map(RangeSummator::result)
        .sum()
        .let(::println)
}

// do not change the lines below

val mainThreadId = Thread.currentThread().id

class RangeSummator(var fromIncl: Int, var toIncl: Int) : Thread() {
    @Volatile
    var result: Long = 0
        private set

    override fun run() {
        val currentId = currentThread().id
        if (currentId == mainThreadId) {
            throw RuntimeException("You must start a new thread!")
        }
        var sum: Long = 0
        for (i in fromIncl..toIncl) {
            sum += i.toLong()
        }
        result = sum
    }
}