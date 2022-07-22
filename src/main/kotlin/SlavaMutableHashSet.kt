//TODO
// Реализовать класс SlavaMutableSet Стрингов, имплементирующий Collection, чтобы с ним можно было работать аналогично обычному MutableSet
// (добавить метод добавления строки, контейнс, ремув, корректная работа forEach()),
// сами элементы, которые будут добавляться, должны храниться в коллекции MutableList.
// Реализовать тест сравнения работы SlavaMutableSet с обычным MutableSet в main().

//TODO 1. без оптимизации: использование только equals, вообще не трогаем HashCode (SlavaMutableSet) //до среды!!!
//TODO 2.* реализация добавить оптимизацию с использованием корзин HashCode (SlavaMutableHashSet). //до субботы!!!

/*
1. Создание листа листов
2. При добавлении нового элемента сразу исключаем добавление дубликата
3. //TODO Как использовать хэш код как индикатор корзины (в названии или нулевой позиции)?
 */

class SlavaMutableHashSet : MutableSet<MutableList<String>> {

    private val list: MutableList<MutableList<String>> = ArrayList()

//    private val list = listL.toMutableList()


    override val size: Int
        get() = list.size

    fun contains(element: String): Boolean {
        list.forEach { basket ->
            basket.forEach {
                if (element.hashCode() == it.hashCode() && element == it) {
                    return true
                }
            }
        }
        return false
    }

    fun add(element: String): Boolean {
        if (!contains(element)) {
            add(mutableListOf(element))
            return true
        }
        return false
    }

    override fun add(element: MutableList<String>): Boolean {
        return list.add(element)
    }

    override fun containsAll(elements: Collection<MutableList<String>>): Boolean {
        //TODO необходима реализация
        return list.containsAll(elements)
    }

    override fun isEmpty(): Boolean {
        return list.isEmpty()
    }

    override fun iterator(): MutableIterator<MutableList<String>> {
        return list.iterator()
    }

    override fun retainAll(elements: Collection<MutableList<String>>): Boolean {
        //TODO необходима реализация
        return list.retainAll(elements)
    }

    override fun removeAll(elements: Collection<MutableList<String>>): Boolean {
        return list.removeAll(elements)
    }

    override fun contains(element: MutableList<String>): Boolean {
        return list.contains(element)
    }

    override fun addAll(elements: Collection<MutableList<String>>): Boolean {
        //TODO необходима реализация
        return list.addAll(elements)
    }

    override fun remove(element: MutableList<String>): Boolean {
        //TODO необходима реализация
        return list.remove(element)
    }

    override fun clear() {
        list.clear()
    }
}