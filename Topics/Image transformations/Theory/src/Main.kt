// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  symAcrossHorAxis(100, 200, 99, 199)
}

fun symAcrossHorAxis(width: Int, height: Int, x: Int, y: Int) {
    // fill the correct x2, y2 assignments
    val x2 = x
    val y2 = height - y - 1

    println("$x2 $y2")
}