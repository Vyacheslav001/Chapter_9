abstract class SuperTest(val s: String)

data class Test1(val a: String): SuperTest(""){

}
data class Test2(val a: String)
class Test3(val a: String)

fun main() {
    val test1 = Test1("A")
    val test2 = Test2("A")
    val test3 = Test1("A")
    val test4 = Test1("B")

    val test5 = Test3("A")
    val test6 = Test3("A")

    println("${test1.hashCode()} ${test2.hashCode()} ${test3.hashCode()} ${test4.hashCode()}")
    println("${test5.hashCode()} ${test6.hashCode()}")

    println(test1.equals(test2))
    println(test1 == test3)
    println(test1 == test4)
    println(test5 == test6)

    val setTest = setOf(test1, test2, test3, test4)
    for (item in setTest) print("$item ")
}