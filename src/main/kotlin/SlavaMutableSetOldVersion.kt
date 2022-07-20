//TODO
// Реализовать класс SlavaMutableSet Стрингов, имплементирующий Collection, чтобы с ним можно было работать аналогично обычному MutableSet
// (добавить метод добавления строки, контейнс, ремув, корректная работа forEach()),
// сами элементы, которые будут добавляться, должны храниться в коллекции MutableList.
// Реализовать тест сравнения работы SlavaMutableSet с обычным MutableSet в main().

//TODO 1. без оптимизации: использование только equals, вообще не трогаем HashCode (SlavaMutableSet) //до среды!!!
//TODO 2.* реализация добавить оптимизацию с использованием корзин HashCode (SlavaMutableHashSet). //до субботы!!!

class SlavaMutableSetOldVersion : Collection<String> {
    private val list: MutableList<String> = ArrayList()

    override val size: Int
        get() = list.size

    override fun containsAll(elements: Collection<String>): Boolean {
        var count = 0
        for (item in elements) {
            if (list.contains(item)) {
                count++
            }
        }
        if (count == elements.size) {
            return true
        }
        return false
    }

    override fun isEmpty(): Boolean {
        if (list.isEmpty()) return true
        return false
    }

    override fun iterator(): Iterator<String> {
        return list.iterator()
    }

    override fun contains(element: String): Boolean {
        for (item in list)
            if (element == item) {
                return true
            }
        return false
    }

    private fun add(element: String) {
        when {
            list.isEmpty() -> list.add(element)
            else -> if (!contains(element)) {
                list.add(element)
            }
        }
    }

    fun addAll(elements: Collection<String>) {
        for (item in elements) {
            add(item)
        }
    }

    fun remove(element: String) {
        for (item in list) {
            if (item == element) {
                list.remove(item)
                break
            }
        }
    }

//    fun clear(){
//        for (item in list){
//            list.remove(item)
//        }
//    }
}
