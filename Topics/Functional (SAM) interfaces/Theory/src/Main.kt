// You can experiment here, it won’t be checked

import java.util.logging.Filter
import java.util.logging.Level
import java.util.logging.LogRecord
import java.util.logging.Logger


object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val logger = Logger.getLogger(Main::class.java.name)
        val filter: Filter = FilterExample()
        logger.filter = filter
        logger.severe("Severe Log")
        logger.info("Info Log")
        logger.warning("Warning Log")
    }
}

class FilterExample : Filter {
    override fun isLoggable(record: LogRecord): Boolean {
        return !(record.level !== Level.INFO || record.level !== Level.WARNING)
    }
}