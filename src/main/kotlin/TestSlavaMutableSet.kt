fun main() {

    /**
    ТЕСТ: СРАВНЕНИЕ РАБОТЫ MutableSet и SlavaMutableSet
     */

// 1. MutableSet

    println("Add elements to MutableSet")
    println()
    val mSet: MutableSet<String> = mutableSetOf()
    mSet.add("2")
    mSet.add("1")
    mSet.add("3")
    mSet.add("3")
    mSet.add("4")
    mSet.add("1")
    mSet.add("set1")
    mSet.add("set2")

    print("mSet: ")
    mSet.forEach {
        print("$it ")
    }
    println()
    println("-----------------------")

// 2. SlavaMutableSet

    println("Add elements to SlavaMutableSet")
    println()
    val mSlavaSet = SlavaMutableSet()
    mSlavaSet.add("1")
    mSlavaSet.add("2")
    println("Add element 3 for the first time: ${mSlavaSet.add("3")}")
    println("Add element 3 repeatedly: ${mSlavaSet.add("3")}")
    mSlavaSet.add("4")
    mSlavaSet.add("1")
    mSlavaSet.add("set1")
    mSlavaSet.add("set2")

    print("mSlavaSet: ")
    mSlavaSet.forEach {
        print("$it ")
    }
    println()

    println("---------------tests------------------")
    println("containsAll() mSet contains mSlavaSet: ${mSet.containsAll(mSlavaSet)}")
    println("containsAll() mSlavaSet contains mSet: ${mSlavaSet.containsAll(mSet)}")
    println("addAll() from mSet to mSlavaSet: ${mSlavaSet.addAll(mSet)}")
    print("Result addAll() from mSet to mSlavaSet: ")
    mSlavaSet.forEach {
        print("$it ")
    }
}