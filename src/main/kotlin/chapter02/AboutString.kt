package chapter02

import java.time.Instant
import java.time.ZoneId

fun main(args: Array<String>) {
    // string interpolation
    val name: String = "soc"
    val date: Instant = Instant.now()
    println("$name's registration date: $date")
    println("$name's registration date: ${date.atZone(ZoneId.of("Asia/Seoul"))}")

    println("""This is the first line | and this is the second one.""".trimMargin())
}