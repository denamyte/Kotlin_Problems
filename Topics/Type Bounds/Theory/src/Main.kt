// You can experiment here, it won’t be checked

val text = "Two exquisite objection delighted deficient yet its contained. Cordial because are account evident its subject but eat. Can properly, followed learning prepared you doubtful yet him. Over many our good lady feet ask that. Expenses own moderate day fat trifling stronger sir domestic feelings. Itself at be answer always exeter up do. Though or my plenty uneasy do. Friendship so considered remarkably be to sentiments. Offered mention greater fifteen one promise because nor. Why denoting speaking fat indulged saw dwelling raillery. Do play they miss give so up. Words to up style of since world. We leaf to snug on no need. Way own uncommonly travelling, now acceptance bed compliment solicitude. Dissimilar admiration so terminated no in contrasted it. Advantages entreaties mr he apartments do. Limits far yet turned highly repair parish talked six. Draw fond rank form nor the day eat."
fun main(args: Array<String>) {
    println(countWords(text))
}

fun countWords(text: String): Int {
    return text.split(" ").count()
}
