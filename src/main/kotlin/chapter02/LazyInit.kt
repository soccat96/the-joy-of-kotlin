package chapter02

import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import java.time.Instant

fun main(args: Array<String>) {
    val name: String by lazy {
        getName()
    }

    println("Hi 1")
    val name2: String by lazy {
        name
    }

    println("Hi 2")
    println(name)
    println(name2)
    println(name)
    println(name2)

    val person = Person("Bob")
    println(person.name) // call getter

    val persons = listOf(
        Person("Mike"),
        Person("Paul")
    )
    show(persons)

    Person.create("someXmlString")
    Person.Companion.create("someXmlString")

    val utilPerson = util.create("someXmlString")

    val list1 = listOf(1, 2, 3)
    val list2 = list1 + 4
    val list3 = list1 + list2
    println(list1)
    println(list2)
    println(list3)

    val mutableList1 = mutableListOf(1, 2, 3)
    val mutableList2 = mutableList1.add(4)
    val mutableList3 = mutableList1.addAll(mutableList1)
    println(mutableList1) // [1, 2, 3, 4, 1, 2, 3, 4]
    println(mutableList2) // true
    println(mutableList3) // true

//    val mutableList1: List<Int> = mutableListOf(1, 2, 3)
//    val mutableList2: List<Int> = mutableList1.add(4)
//    val mutableList3: List<Int> = mutableList1.addAll(mutableList1)
//    println(mutableList1)
//    println(mutableList2)
//    println(mutableList3)
}

fun getName(): String {
    println("calculating name...")
    return "Clinton Richard Dawkins"
}

//open class Person(val name: String, val registered: Instant) : Serializable, Comparable<Person> {
//    override fun compareTo(other: Person): Int {
//        TODO("Not yet implemented")
//    }
//}
//class Member(name: String, registered: Instant) : Person(name, registered)

//class Person(val name: String, val registered: Instant = Instant.now())

//class Person(val name: String, val registered: Instant = Instant.now()) {
//    constructor(name: Name) : this(name.toString()) {
//
//    }
//}

//class Person private constructor(val name: String)

data class Person(val name: String, val registered: Instant = Instant.now()) {
    companion object {
        fun create(xml: String): Person {
//            TODO("Write an implementation creating " + "a Person from an xml String")
            return Person("FROM_XML")
        }
    }
}

//fun show(persons: List<Person>) {
//    for ((name, date) in persons) {
//        println("$name's registration date:$date")
//    }
//}

fun show(persons: List<Person>) {
    for (person in persons) {
        println("${person.component1()}'s registration date:${person.component2()}")
    }
}

object MyWindowAdapter: WindowAdapter() {
    override fun windowClosed(e: WindowEvent?) {
        TODO("not implemented")
    }
}
