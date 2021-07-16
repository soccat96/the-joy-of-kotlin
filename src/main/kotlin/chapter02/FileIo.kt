package chapter02

import java.io.File

fun main(args: Array<String>) {
    File("myFile.txt").inputStream().use {
        it.bufferedReader().lineSequence().forEach(::println)
    }
    //    val lines: Sequence<String> = File("myFile.txt").inputStream().use {
    //        it.bufferedReader().lineSequence()
    //    }
    //    lines.forEach(::println) >> IO Exception : Stream Closed
    val lines: List<String> = File("myFile.txt").inputStream().use {
        it.bufferedReader().lineSequence().toList()
    }
    lines.forEach(::println)
    File("myFile.txt").forEachLine { println(it) }
    File("myFile.txt").useLines { it.forEach(::println) }
}
