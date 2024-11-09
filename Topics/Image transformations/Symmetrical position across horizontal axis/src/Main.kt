fun symAcrossHorAxis(width: Int, height: Int, x: Int, y: Int) {
    // fill the correct x2, y2 assignments
    val x2 = x
    val y2 = height - y - 1

    println("$x2 $y2")
}

fun main() {
    val (s1, s2, s3, s4) = readLine()!!.split(" ")
    val width = s1.toInt()
    val height = s2.toInt()
    val x = s3.toInt()
    val y = s4.toInt()
    symAcrossHorAxis(width, height, x, y)
}