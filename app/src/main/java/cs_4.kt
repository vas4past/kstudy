fun main() {
    try {
        print("Введите целое число: ")
        val input = readLine()
        val number = input?.toInt() ?: throw NumberFormatException()
        println("Вы ввели число: $number")
    } catch (e: NumberFormatException) {
        println("Ошибка: введено не целое число!")
    } finally {
        println("Конец программы")
        println()
    }

    try {
        val x = 10
        val y = 0
        val result = x / y
        println(result)
    } catch (e: ArithmeticException) {
        println("Делить на ноль нельзя")
        e.printStackTrace()
    }
}