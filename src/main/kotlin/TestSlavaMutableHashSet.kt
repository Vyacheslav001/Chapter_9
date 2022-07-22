fun main() {
    val mSlavaMutableHashSet = SlavaMutableHashSet()

    mSlavaMutableHashSet.add("1")
    mSlavaMutableHashSet.add("2")
    mSlavaMutableHashSet.add("3")
    mSlavaMutableHashSet.add("1")
    mSlavaMutableHashSet.add("4")
    mSlavaMutableHashSet.add("3")
    mSlavaMutableHashSet.add("3")
    mSlavaMutableHashSet.add("fdahsrfghn")
    mSlavaMutableHashSet.add("fdahsrfghn")
    mSlavaMutableHashSet.add("ergf")
    mSlavaMutableHashSet.add("erd21414gf")

    println(mSlavaMutableHashSet.size)

    mSlavaMutableHashSet.forEach{
        print("$it ")
    }
}