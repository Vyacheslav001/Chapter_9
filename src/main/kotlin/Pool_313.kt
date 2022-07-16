fun main() {
    val term1 = "Array"
    val term2 = "List"
    val term3 = "Map"
    val term4 = "MutableList"
    val term5 = "MutableMap"
    val term6 = "MutableSet"
    val term7 = "Set"

    val def1 = "Holds values in no particular order." //67
    val def2 = "Holds key/value pairs." //35
    val def3 = "Holds values in a sequence." //124
    val def4 = "Can be updated." //1456
    val def5 = "Can't be updated."//237
    val def6 = "Can be resized."//456
    val def7 = "Can't be resized."//1237

    val glossary = mapOf(
    term4 to "$def3 $def4 $def6",
    term7 to "$def1 $def5 $def7",
    term1 to "$def3 $def4 $def7",
    term5 to "$def2 $def4 $def6",
    term2 to "$def3 $def5 $def7",
    term6 to "$def1 $def4 $def6",
    term3 to "$def2 $def5 $def7")
    for ((key, value) in glossary) println("$key: $value")
}

//MutableList: Holds values in a sequence. Can be updated. Can be resized.
//Set: Holds values in no particular order. Can't be updated. Can't be resized.
//Array: Holds values in a sequence. Can be updated. Can't be resized.
//MutableMap: Holds key/value pairs. Can be updated. Can be resized.
//List: Holds values in a sequence. Can't be updated. Can't be resized.
//MutableSet: Holds values in no particular order. Can be updated. Can be resized.
//Map: Holds key/value pairs. Can't be updated. Can't be resized.