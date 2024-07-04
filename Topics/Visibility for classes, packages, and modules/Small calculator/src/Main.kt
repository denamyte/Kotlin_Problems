interface InterfaceTask {
    fun taskFunction(variable: List<Int>)
}

class TaskClass : InterfaceTask {

    protected val i = 100
    protected fun asdfsa() {

    }

    override fun taskFunction(variable: List<Int>) {
        println("${variable[0] + variable[1]}")
    }
}

private fun function() {

}