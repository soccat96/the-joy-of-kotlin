package chapter02

const val multiplier = 3
fun multiplyAll_1(list: List<Int>): List<Int> = list.map {it * multiplier}
fun multyplyAll_2(list: List<Int>, multiplier: Int): List<Int> = list.map {it * multiplier}