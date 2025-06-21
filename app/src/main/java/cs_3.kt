@file:Suppress("UNREACHABLE_CODE")


/*
Return, Break, Continue:

Напишите функцию, которая принимает массив чисел и возвращает сумму только тех чисел,
которые больше 10. Если обнаруживается число меньше 0, функция должна немедленно
прекратить обработку и вернуть текущую сумму (используйте return).

Напишите цикл, который выводит числа от 1 до 10, но пропускает числа 3 и 7 (используйте continue).

Вам дана двумерная матрица целых чисел и целевое число. Напишите программу на Kotlin,
чтобы искать целевое число в матрице. Если целевое число найдено,
выведите его позицию (строка и столбец) и завершите выполнение циклов; если не найдено,
выведите сообщение об этом.(используйте break). Целевое значение должно вводиться пользователем.
*/

fun readNumber(prompt: String = "Введите число: "): Int? {
    print(prompt)
    val input = readLine()
    return input?.toIntOrNull()
}

fun summOfNumbers(numbersArray: Array<Int>): Int {
    var sum = 0;
    for (number in numbersArray) {
        if (number > 10) {
            sum += number
        }
        if (number < 0) {
            println("Обнаружено отрицательное число ($number). Текущая сумма: $sum")
            return sum
        }

    }
    println("Итоговая сумма чисел больше 10: $sum")
    return sum
}

fun findANumber(matrix: Array<Array<Int>>) {
    var row = 0;
    var col = 0;
    var myNumber = readNumber();
    for (row in matrix.indices) {
        for (col in matrix[row].indices) {
            if (matrix[row][col] == myNumber) {
                println("Число $myNumber найдено в строке $row, столбце $col")
                return
            }
        }
    }
    println("Число $myNumber не найдено в матрице.")
}

fun main() {
    println("Задание 1")
    val myArray = arrayOf(1, 2, 15, 29, 4, 0, 11, 8, 12)
    var result = summOfNumbers(myArray)
    println("Задание 2")
    println("Числа от 1 до 10, но без 3 и 7 ")
    for (i in 1..10) {
        if (i == 3) {
            continue
        }
        if (i == 7) {
            continue
        }
        println(i)
    }

    println("Задание 3")
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(11, 12, 13, 14, 15),
        arrayOf(16, 17, 18, 19, 20),
        arrayOf(21, 22, 23, 24, 25)
    )
    var result3 = findANumber(matrix)
}
