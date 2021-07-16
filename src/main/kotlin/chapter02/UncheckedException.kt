package chapter02

fun main(args: Array<String>) {
    val num: Int = try {
        args[0].toInt()
    } catch (e: Exception) {
        0
    } finally {

    }
}

