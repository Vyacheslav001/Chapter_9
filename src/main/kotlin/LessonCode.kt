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

//    shopping.forEach()

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
    val friendSet: Set<String> = setOf("Jim", "Sue", "Nick")
    iterator<String> {

    }

    val isFredGoing = friendSet.contains("Fred")
    for (item in friendSet) println("$item ")

    //TODO корзины в Set стр. 297



    //mutableSet

    val mFriendSet = mutableSetOf("Jim", "Sue", "Nick")
    println("Checking for duplicates: ${mFriendSet.add("Nick1")}")
    for (item in mFriendSet) print("$item ")
    println()
    println("Remove: ${mFriendSet.remove("Nick")}")

    val toAddFriends = setOf("Joe", "Mia")
    mFriendSet.addAll(toAddFriends)
    mFriendSet.retainAll(toAddFriends) //сначала добавить, затем удалить все остальное
    for (item in mFriendSet) print("$item ")
    println()

    val friendSetCopy = mFriendSet.toSet()
    val friendList = mFriendSet.toList()

    val shoppingSet = mShopping.toSet()
    if (mShopping.size > shoppingSet.size) println("Yes") else println("No")

    println()

//MAP

    println("MAP")

    data class Recipe(val r: String)

    val r1 = Recipe("Chicken Soup")
    val r2 = Recipe("Quinoa Salad")
    val r3 = Recipe("Thai Curry")

    val recipeMap = mapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)

    recipeMap.containsKey("Recipe1")

    val recipeToCheck = Recipe("Chicken Soup")
    if (recipeMap.containsValue(recipeToCheck)) {
    }

    if (recipeMap.containsKey("Recipe1")) {
        val recipe = recipeMap.getValue("Recipe1")
        println(recipe)
    }

    for ((key, value) in recipeMap) {
        println("Key is $key, value is $value")
    }

    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2)
    mRecipeMap.put("Recipe3", r3)
    mRecipeMap.put("Recipe1", Recipe("1"))
    for ((key, value) in mRecipeMap) println("$key  =  $value")

    val r4 = Recipe("Jambalaya")
    val r5 = Recipe("Sausage Rolls")

    val recipesToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipesToAdd)

    mRecipeMap.remove("Recipe2")

    val recipeToRemove = Recipe("Quinoa Salad")
    mRecipeMap.remove("Recipe2", recipeToRemove)

//    mRecipeMap.clear()

    val recipeMapCopy = mRecipeMap.toMap()
    val recipeList = mRecipeMap.toList()

    print("Map to List: ")
    for (item in recipeList) print("$item ")
    println()

    print("Map to Set: ")
    val recipeEntries = mRecipeMap.entries
    for (item in recipeEntries) print("$item ")
    println()

    print("Map to ValuesSet: ")
    val recipeValuesSet = mRecipeMap.values.toSet()
    for (item in recipeValuesSet) print("$item ")
    println()

    print("Map to KeysSet: ")
    val recipeKeysSet = mRecipeMap.keys.toSet()
    for (item in recipeKeysSet) print("$item ")
    println()

    val r6 = Recipe("Jambalaya")
    mRecipeMap["Recipe6"] = r6

    if (mRecipeMap.size > mRecipeMap.values.toSet().size) println("Yes") else println("No duplicates")

}