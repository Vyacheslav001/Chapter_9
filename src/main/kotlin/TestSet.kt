class Class1(var int: Int)
class Class2(var int: Int)
data class DataClass1(var int: Int)
data class DataClass2(var int: Int)


fun main() {
    val class1 = Class1(1)
    val class2 = Class2(1)

    println(class1.equals(class2))

    val dataClass11 = DataClass1(1)
    val dataClass21 = DataClass2(1)
    val dataClass22 = DataClass2(1)

    println("hashCode class1: ${class1.hashCode()}")
    println("hashCode class2: ${class2.hashCode()}")
    println("hashCode dataClass11: ${dataClass11.hashCode()}")
    println("hashCode dataClass21: ${dataClass21.hashCode()}")
    println("hashCode dataClass22: ${dataClass22.hashCode()}")

    println(dataClass11.equals(class1))
    println(class1.equals(dataClass11))

    println(dataClass21.equals(dataClass11))
    println(dataClass11.equals(dataClass21))

    println(dataClass22 == dataClass21)

    val str1 = "str"
    val str2 = "str"

    println("hashCode str1: ${str1.hashCode()}")
    println("hashCode str2: ${str2.hashCode()}")

    println("str1 == str2: ${str1 == str2}")

    //SET

    val set = mutableSetOf(dataClass11, class1, dataClass21, class2, dataClass22, str1, str2)
    set.forEach {
    print("$it ")
    }
    println()

    val str = "fgaedrfg"
    val list1 = mutableListOf(str)
    val list2 = mutableListOf("fgaedrfg")
    val list3 = mutableListOf("fgaedrfga")
    println("hashCode str: ${str.hashCode()}")
    println("hashCode list1: ${list1.hashCode()}")
    println("hashCode list2: ${list2.hashCode()}")
    println("hashCode list3: ${list3.hashCode()}")
}