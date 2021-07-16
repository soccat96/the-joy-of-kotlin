package chapter02

/**
 * in 과 out 중 어떤 것을 선택할지는
 * 타입을 오직 출력(반환 값)에 쓰면 out
 * 타입을 오직 입력(인자 값)에 쓰면 in
 */

//open class MyClassParent
//class MyClass: MyClassParent()
//interface Bag<out T> {
//    fun get(): T
//}
//class BagImpl: Bag<MyClass> {
//    override fun get(): MyClass = MyClass()
//}
//val bag: Bag<MyClassParent> = BagImpl()

//open class MyClassParent
//class MyClass: MyClassParent()
//interface Bag<in T> {
//    fun use(t: T): Boolean
//}
//class BagImpl: Bag<MyClassParent> {
//    override fun use(t: MyClassParent): Boolean = true
//}
//val bag: Bag<MyClass> = BagImpl()

open class MyClassParent
class MyClass: MyClassParent()
interface Bag<T> {
    fun get(): T
    fun use(t: T): Boolean
}
class BagImpl : Bag<MyClassParent> {
    override fun get(): MyClassParent = MyClassParent()
    override fun use(t: MyClassParent): Boolean = true
}
fun useBag(bag: Bag<in MyClass>): Boolean {
    return true
}
val bag3 = useBag(BagImpl())
fun createBag(): Bag<out MyClassParent> = BagImpl2()
class BagImpl2 : Bag<MyClass> {
    override fun use(t: MyClass): Boolean = true
    override fun get(): MyClass = MyClass()
}

fun main(args: Array<String>) {
//    fun <T> addAll(list1: MutableList<T>, list2: MutableList<T>) {
//        for (elem in list2) list1.add(elem)
//    }
    fun <T> addAll(list1: MutableList<T>, list2: MutableList<out T>) {
        for (elem in list2) list1.add(elem)
    }
    val ls = mutableListOf("A String")
    val la: MutableList<Any> = mutableListOf()
    addAll(la, ls)
}
