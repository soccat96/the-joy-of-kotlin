package chapter02

fun main() {
    fun <T> List<T>.length() = this.size
    val ints1 = listOf(1, 2, 3, 4, 5, 6, 7)
    val listLength = ints1.length()

    fun List<Int>.product(): Int = this.fold(1) { a, b -> a * b}
    val ints2 = listOf(1, 2, 3, 4, 5, 6, 7)
    val product = ints2.product()

    println(product)
    println(2 * 3 * 4 * 5 * 6 * 7)
}

