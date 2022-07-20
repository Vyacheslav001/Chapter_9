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

    val mMap = mutableMapOf("m1" to 1, "m2" to 2)
    val mList = mMap.toList()
    println("mList.get(0).second: ${mList[0].second}")
    val mListOfValues = mMap.values.toList()
    for (item in mListOfValues) print("$item ")
//    println("${mList[0]*2}")
    val x = 0
    val x2 = mListOfValues[x] * 2
    println(x2)
    println("---------------------")

    //TODO как работать с Map, преобразованной в List
    //TODO Что сидит в List

    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        print("${numbersIterator.next()} ")
    }
    println()

    val mNumbers = mutableListOf("one", "two", "three", "four")
    val mutableIterator = mNumbers.iterator()

    mutableIterator.next()
    mutableIterator.remove()
    println("After removal: $numbers ")
}