class Square(val x: Double) {
    val area: Double by lazy {
        print("First time: ")
        x * x
    }
}
