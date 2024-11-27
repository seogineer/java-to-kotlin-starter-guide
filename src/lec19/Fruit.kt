package lec19

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long?,
) {
    fun nullOrValue(): Long? {
        return currentPrice
    }

    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}
