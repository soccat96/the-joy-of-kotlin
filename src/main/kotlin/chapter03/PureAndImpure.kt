package chapter03

class FunFunctions {
    /**
     * 어떤 함수나 메서드가 순수 함수가 되기 위해 필요한 조건
     * 1. 함수 외부의 어떤 것도 변이시켜서는 안 된다. 내부에서 상태를 변이시키더라도 그 상태를 외부에서 관찰할 수 없어야 한다.
     * 2. 인자를 변이시켜서는 안 된다.
     * 3. 예외나 오류를 던져서는 안 된다.
     * 4. 항상 값을 반환해야 한다.
     * 5. 인자가 같으면 항상 같은 결과를 내놓아야 한다.
     */

    var percent1 = 5
    private var percent2 = 9
    val percent3 = 13

    fun add(a: Int, b: Int): Int = a + b
    fun mult(a: Int, b: Int?): Int = 5
    fun div(a: Int, b: Int): Int = a / b
    fun div(a: Double, b: Double): Double = a / b
    fun applyText1(a: Int): Int = a / 100 * (100 + percent1)
    fun applyText2(a: Int): Int = a / 100 * (100 + percent2)
    fun applyText3(a: Int): Int = a / 100 * (100 + percent3)
    fun append(i: Int, list: MutableList<Int>): List<Int> {
        list.add(i)
        return list
    }
    fun append2(i: Int, list: List<Int>) = list + i

    /**
     * add true
     * mult true
     * div false a / 0
     * div
     * applyText1
     * applyText2
     * applyText3
     * append
     * append2
     */
}