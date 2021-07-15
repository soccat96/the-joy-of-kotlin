package chapter01

fun main(args: Array<String>) {
    val x = add(multi(2, 3), multi(4, 5))
    print(x)
}

fun add(a: Int, b: Int): Int {
    log(String.format("Returning ${a + b} as the result of $a + $b"))
    return a + b
}

fun multi(a: Int, b: Int) = a * b

fun log(m: String) {
    println(m)
}