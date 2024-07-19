// change this function:
suspend fun logImageLoading(url: String) =
    loadImage(url).also { println("Image loaded!") }