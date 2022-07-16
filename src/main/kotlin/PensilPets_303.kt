fun main() {

    //Четверо друзей составили списки List своих домашних питомцев. Один элемент представляет одно животное. Списки
    //выглядят так:

    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    //Напишите код для создания новой коллекции pets, в которой присутствуют все животные из всех списков.

    val pets = petsLiam.toMutableList()
    pets.addAll(petsSophia)
    pets.addAll(petsNoah)
    pets.addAll(petsEmily)
    println("Pets: $pets")

    //Как бы вы использовали коллекцию pets для получения общего количества животных?

    println("Number of pets: ${pets.size}")

    //Напишите код для вывода количества разных видов животных.

    val petsSet = pets.toSet()
    println("Number of animal species: ${petsSet.size}")

    //Как бы вы перечислили разные виды животных в алфавитном порядке?

    val petsSortList = petsSet.toMutableList()
    petsSortList.sort()
    println("Alphabetically: $petsSortList")
}