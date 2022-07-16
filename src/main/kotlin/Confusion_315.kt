fun main() {
    val mList = mutableListOf("Football", "Baseball", "Basketball")

//1.
    mList.sort()
    println(mList)

//2.
    val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values)

//3.
    mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set)

//4.
    mList.sort()
    mList.reverse()
    println(mList)
}

/* my answers:
1-2
2-3
3-6
4-4
 */