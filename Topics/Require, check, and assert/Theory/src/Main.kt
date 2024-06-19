// You can experiment here, it won’t be checked

fun main() {

}

fun calculateTax(amount: Double): Double {
    val tax = amount * 0.3
    assert(tax == amount * 0.3) { "Error in tax calculation" }
    return tax
}

class Item(val quantity: Int)

fun addItem(item: Item) {
    check(item.quantity > 0) { "Item quantity must be greater than zero" }
}

fun getTaxes(amount: Double): Double {
    require(amount > 0) { "Amount must be greater than zero" }
}