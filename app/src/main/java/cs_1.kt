/*
Условные операторы:
Напишите программу, которая принимает целое число от пользователя и проверяет,
является ли оно положительным, отрицательным или нулем.
Используйте различные варианты условных операторов (if, if-else, when).
 */
fun main() {
    val a = 0;
    if (a > 0) {
        println("Число А положительное")
    } else if (a < 0) {
        println("Число А отрицательное")
    } else println("Число А это ноль")

    val x = -4
    when (x) {
        1 -> println("x равно 1")
        2 -> println("x равно 2")
        else -> println("x не равно 1 и 2")
    }
}



