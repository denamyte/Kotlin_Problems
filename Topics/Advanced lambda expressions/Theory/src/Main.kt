// You can experiment here, it won’t be checked

fun interface ClickListener {
    fun onClick(viewId: Int)
}

val clickListener = ClickListener { viewId ->
    println("Clicked on view with ID $viewId")
}
fun main() {
    clickListener.onClick(1)
}
