fun main() {
    println("Введите слова через пробел: ")
    val text = readln()
    val words: List<String> = text.split(" ").map { it.trim() }
    val Words = mutableMapOf<String, MutableList<String>>()

    for (i in words) {
        val sortedWords = i.toCharArray().sorted().joinToString("")

        if (Words.containsKey(sortedWords)) {
            Words[sortedWords]!!.add(i)
        } else {
            Words[sortedWords] = mutableListOf(i)
        }
    }
    println("Вывод группы слов, состоящих из одинаковых букв: ")
    for ((_, value) in Words) {
        println(value.joinToString(" "))
    }
}