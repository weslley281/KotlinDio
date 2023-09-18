package funcoes.tipos

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "Não há produtos"

val Order.commaDelimitedItemNames: String get() = items.map { it.name }.joinToString()

fun main() {
    val order = Order(listOf(Item("Pão", 25.0F), Item("Vinho", 29.0F), Item("Agua", 2.0F)))

    val maxPricedItemValue = order.maxPricedItemValue()
    val maxPricedItemName = order.maxPricedItemName()
    val commaDelimitedItemNames = order.commaDelimitedItemNames

    println("Valor do item mais caro: $maxPricedItemValue")
    println("Nome do item mais caro: $maxPricedItemName")
    println("Nomes dos itens separados por vírgula: $commaDelimitedItemNames")
}
