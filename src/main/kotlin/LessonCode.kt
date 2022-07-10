fun main(args: Array<String>) {
    var array = arrayOf(1, 3, 2)
    val arrayCopy = array.copyOf()
    array[0] = 5
    val sum = array.sum()
    val max = array.max()
    println(sum)
    println(array.contains(1))
    var nullArray: Array<String?> = arrayOfNulls(3)
    nullArray[0] = "a"
    nullArray[1] = "b"
    nullArray[2] = "c"
    for (item in nullArray) print("$item ")
    println()
    nullArray.reverse()
    for (item in nullArray) print("$item ")
    println()
    nullArray.sort()
    for (item in nullArray) print("$item ")
    println()
    println(nullArray.maxBy {
        it.toString()
    })
    println(nullArray.minBy {
        it.toString()
    })
    val average = array.average()
    println(average)
    val nullArray2 = nullArray.plus("d")
    for (item in nullArray2) print("$item ")
    println()

//LIST

    val shopping = listOf("Tea", "Eggs", "Milk")
    if (shopping.size > 0) println(shopping.get(0))
    for (item in shopping) println(item)
    if (shopping.contains("Milk")) println(shopping.indexOf("Milk"))

    val mShopping = mutableListOf("Tea", "Eggs")
    mShopping.add(1, "Milk")
    mShopping.set(0, "Tea")
    mShopping.sort()
    mShopping.reverse()
    mShopping.shuffle()

    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)

    println()
    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)
    for (item in mShopping) println("$item ")

    val toRetain = listOf("Milk", "Sugar")
    mShopping.retainAll(toRetain)
    for (item in mShopping) println("$item ")
    println()

    mShopping.clear()

    val shoppingCopy = mShopping.toList()
    val mShoppingCopy = mShopping.toMutableList()

//SET
    val friendSet = setOf("Jim", "Sue", "Nick")
    val isFredGoing = friendSet.contains("Fred")
    for (item in friendSet) println("$item ")


}