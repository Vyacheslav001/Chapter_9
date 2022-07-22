//TODO
// Реализовать класс SlavaMutableSet Стрингов, имплементирующий Collection, чтобы с ним можно было работать аналогично обычному MutableSet
// (добавить метод добавления строки, контейнс, ремув, корректная работа forEach()),
// сами элементы, которые будут добавляться, должны храниться в коллекции MutableList.
// Реализовать тест сравнения работы SlavaMutableSet с обычным MutableSet в main().

//TODO 1. без оптимизации: использование только equals, вообще не трогаем HashCode (SlavaMutableSet) //до среды!!!
//TODO 2.* реализация добавить оптимизацию с использованием корзин HashCode (SlavaMutableHashSet). //до субботы!!!

class SlavaMutableSet : MutableSet<String> {
    private val list: MutableList<String> = ArrayList()

    override val size: Int
        get() = list.size

    override fun add(element: String): Boolean {
        if (!contains(element)) {
            list.add(element)
            return true
        }
        return false
    }

    override fun addAll(elements: Collection<String>): Boolean {
        if (!containsAll(elements)) {
            elements.forEach {
                add(it)
            }
            return true
        }
        return false
    }

    override fun containsAll(elements: Collection<String>): Boolean {
        //с учетом замечания:
        for (item in elements) {
            if (!list.contains(item)) {
                return false
            }
        }
        return true
        //ЛИБО: return list.containsAll(elements) (с использованием метода листа)
    }

    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    override fun iterator(): MutableIterator<String> {
        return list.iterator()
    }

    override fun retainAll(elements: Collection<String>): Boolean {
        return list.retainAll(elements)
    }

    override fun removeAll(elements: Collection<String>): Boolean {
        return list.removeAll(elements)
    }

    override fun contains(element: String): Boolean {
        return list.contains(element)
    }

    override fun remove(element: String): Boolean {
        return list.remove(element)
    }

    override fun clear() {
        list.clear()
    }
}