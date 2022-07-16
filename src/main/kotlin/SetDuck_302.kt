fun main() {
    val set = setOf(DuckC(), DuckC(17))
    println(set)
}

data class DuckC(val size: Int = 18)

