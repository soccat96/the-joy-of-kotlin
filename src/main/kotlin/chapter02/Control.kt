package chapter02

val country = ""
val capital = when (country) {
    "Australia" -> "Canberra"
    "Bolivia" -> "Sucre"
    "Brazil" -> "Brasilia"
    else -> "Unknown"
}

val tired = true
val country1 = ""
val capital1 = when {
    tired -> "Check for yourself"
    country1 == "Australia" -> "Canberra"
    country1 == "Bolivia" -> "Sucre"
    country1 == "Brazil" -> "Brasilia"
    else -> "Unknown"
}

//val range = 0 until 10 step 2
//for (i in range) println(i) // Expecting a top level declaration < maybe need stack?
fun main(args: Array<String>) {
    val range = 0 until 10 step 2
    for (i in range) println(i)
    for (i in 0.until(10).step(2)) println(i) // until(), step() in defined Int
    for (i in 0..10) println(i)
    for (i in 10 downTo 0) println(i)
}
