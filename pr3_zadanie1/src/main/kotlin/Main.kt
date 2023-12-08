
fun main() {
    println("Введите количество строк в двумерном массиве: ")
    val n = readln().toInt()
    println("Введите количество столбцов в двумерном массиве: ")
    val m = readln().toInt()
    val mas = Array(n) { IntArray(m) { (100..999).random() } }
    var k = 0
    var p = 0
    val count = mutableSetOf<Int>()
    println("Вывод двумерного массива:")
    for (i in 0..n - 1) {
        k++
        for (j in 0..m - 1) {
            p++
            print("${mas[i][j]} ")
            count.addAll(mas[k - 1][p - 1].toString().toList().map { it.toString().toInt() })
        }
        println()
        p = 0
    }
    println("В массиве использовано ${count.size} различных цифр")
}
