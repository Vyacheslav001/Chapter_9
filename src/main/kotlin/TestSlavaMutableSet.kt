fun main() {

    /**
    ТЕСТ: СРАВНЕНИЕ РАБОТЫ MutableSet и SlavaMutableSet
     */

// 1. MutableSet

    println("Test for MutableSet")
    println()
    val mSet: MutableSet<String> = mutableSetOf()
    //Добавление элементов в коллекцию
    mSet.add("2")
    mSet.add("1")
    mSet.add("3")
    mSet.add("3")
    mSet.add("4")
    mSet.add("1")
    mSet.add("set1")
    mSet.add("set2")
    println("Size = ${mSet.size}")

    print("Add elements: ")
    for (item in mSet) {
        print("$item ")
    }
    println()

    print("Remove elements: ")
    mSet.remove("3")
    for (item in mSet) {
        print("$item ")
    }
    println()

    println("Contains element 3: ${mSet.contains("3")}")
    println("Contains element 4: ${mSet.contains("4")}")

    print("forEach(): ")
    mSet.forEach {
        print("$it ")
    }
    println()

    println("-----------------------")

// 2. SlavaMutableSet

    println("Test for SlavaMutableSet")
    println()
    val mSlavaSet = SlavaMutableSet()
    //Добавление элементов в коллекцию
    mSlavaSet.add("1")
    mSlavaSet.add("2")
    mSlavaSet.add("3")
    mSlavaSet.add("3")
    mSlavaSet.add("4")
    mSlavaSet.add("1")
    mSlavaSet.add("set1")
//    mSlavaSet.add("set2")
    println("Size = ${mSlavaSet.size}")

    print("Add elements: ")
    for (item in mSlavaSet) {
        print("$item ")
    }
    println()

    print("Remove elements: ")
    mSlavaSet.remove("3")
    for (item in mSlavaSet) {
        print("$item ")
    }
    println()

    println("Contains element 3: ${mSlavaSet.contains("3")}")
    println("Contains element 4: ${mSlavaSet.contains("4")}")

    print("forEach(): ")
    mSlavaSet.forEach {
        print("$it ")
    }
    println()

    println("---------------Other tests------------------")
    println("containsAll() mSet contains mSlavaSet: ${mSet.containsAll(mSlavaSet)}")
    println("containsAll() mSlavaSet contains mSet: ${mSlavaSet.containsAll(mSet)}")
    mSlavaSet.addAll(mSet)
    print("addAll() mSet to mSlavaSet: ")
    mSlavaSet.forEach {
        print("$it ")
    }
}