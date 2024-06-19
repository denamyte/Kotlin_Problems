// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    println(sum(Triple(1, 2, 3)))
}

fun sum(t: Triple<Int, Int, Int>) = with(t) { first + second + third }