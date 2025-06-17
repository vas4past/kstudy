/*
Домашнее задание Введение в Kotlin
 */
fun main() {
    /*
    Задание 2
     */
    println("Hello, World!")

    /*
    Задание 3
     */
    println("Ввод переменных")
    var x = 1
    val y = 3
    val name: String = "Вася"
    var xBoolean: Boolean = true
    println(xBoolean)

    println("Изменение значения переменной")
    xBoolean = false
    println(xBoolean)

    println("Сумма переменных")
    var z = 0
    z= x + y; // происходит сложение двух переменных и присвается переменной z
    println(z)

    println("Увеличение переменной")
    z++; // происходит увеличение переменной z на одну единицу
    println(z)

    println("Разница переменных")
    val diff = z - y;
    println(diff)

    /*
    Задание 4
     */
    println("Оператор сравнения")
    val isLessOrEqual = y <= x;
    println(isLessOrEqual)

    println("Операторы логические")
    val a = 5
    val b = 10
    val c = 15

    val res = (b < a) && (a < c)
    println(res)

    val res2 = (a <= b) || (a >= c)
    println(res2)

    println("Оператор присваивания")
    var k = 25;
    k -= 12;
    println(k)

    /*
    Задание 5
     */
    println("Введите оценку за первые 1-4 задания по пятибальной шкале:")
    val input = readLine();
    println("Оценка за 1-4 задания = $input" )

}

