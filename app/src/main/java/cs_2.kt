/*
Циклы:

Создайте массив из 10 чисел. Напишите цикл for, который будет выводить каждое число и его квадрат.
После этого напишите цикл while, который будет выводить каждое число и его куб.

Используйте функцию repeat для вывода строки “Привет, мир!” 10 раз.
 */
fun main() {
    // Создайте массив из 10 чисел.
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Цикл for, который будет выводить каждое число и его квадрат.
        for (number in numbers) {
            println("Число: $number, Квадрат: ${number * number}")
        }
        var i = 0;

    // Цикл while, который будет выводить каждое число и его куб.
        while (i < numbers.size) {
            val num = numbers[i]
            println("Число: $num, Куб: ${num * num * num}")
            i++
        }
        var y = 0;
    do {
        val numz = numbers[y]
        println("Число: $numz, Четвертая степень: ${numz * numz * numz * numz}")
        y++
    } while (y < numbers.size)

    //Используйте функцию repeat для вывода строки “Привет, мир!” 10 раз.
    repeat(10) {
        println("Привет, мир!")
    }
}