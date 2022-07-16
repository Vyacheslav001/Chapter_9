data class Test1(val a: String)
data class Test2(val a: String)

class Test3(val a: String)

fun main() {
    val test1 = Test1("A")
    val test2 = Test2("A")
    val test3 = Test1("A")
    val test4 = Test1("B")

    val setTest = setOf(test1, test2, test3, test4)

    for (item in setTest) print("${item.hashCode()} ")
    println()
    println("1==2: ${test1.equals(test2)}")
    println("1==3: ${test1 == test3}")
    println("1==4: ${test1 == test4}")
    for (item in setTest) print("$item ")

    println()
    println()

    val test5 = Test3("A")
    val test6 = Test3("A")
    println("${test5.hashCode()} ${test6.hashCode()}")
    println(test5 == test6)
}