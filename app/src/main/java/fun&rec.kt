@file:Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")

/*
Задание 1: Создайте функцию maxOfTwo, которая принимает два числа в качестве аргументов и возвращает наибольшее число.
Затем, используйте эту функцию для поиска максимального числа из двух разных пар чисел.

Задание 2: Создайте функцию sayHello, которая принимает строковый аргумент name и возвращает приветственное сообщение.
Функция должна иметь параметр по умолчанию "мир". Затем вызовите функцию дважды: с именем и без имени.

Задание 3: Создайте инфиксную функцию isGreater , которая принимает два числа и возвращает true,
если первое число больше второго, и false в противном случае. Затем используйте эту функцию, сравнив две пары чисел.

Задание 4: Создайте рекурсивную функцию generateSequence, которая принимает целое число n и
генерирует последовательность чисел от 1 до n. Используйте аннотацию tailrec для оптимизации.

Задание 5: Создайте список имен и используйте функции let, run, also, apply и with для
выполнения различных операций над этим списком (например, добавьте имя, удалите имя, переверните список и т. д.).
*/
// Задание 1
fun maxOfTwo(num1: Int, num2: Int): Int {
    var x = 0
    if (num1 > num2) {
        x = num1
    } else if (num1 < num2) {
        x = num2
    }
    println("Наибольшее число: $x")
    return x
}

// Задание 2
fun sayHello(name: String = "мир") {
    println("Привет, $name!")
}

// Задание 3
infix fun Int.isGreater(other: Int): Boolean {
    return this > other
}

// Задание 4
tailrec fun generateSequence(
    n: Int,
    x: Int = 1,
    result: MutableList<Int> = mutableListOf()
): List<Int> {
    return if (x > n) {
        result
    } else {
        result.add(x)
        generateSequence(n, x + 1, result)
    }
}

fun main() {
    //Задание 1
    var res1 = maxOfTwo(14, 15)
    var res2 = maxOfTwo(4, 44)
    // Задание 2
    var res3 = (sayHello("Аня"))
    var res4 = println(sayHello())
    // Задание 3
    println(9 isGreater 13)
    println(22 isGreater 12)
    // Задание 4
    val sequence = generateSequence(8)
    println(sequence)
    // Задание 5
    val names = mutableListOf("Влад", "Вася", "Маша")
    names.let {
        println("Имена до добавления: $it")
        it.add("Даша")
    }
    names.run {
        println("Имена до добавления: $this")
        this.add("Саша")
    }
    names.also {
        println("Имена до добавления: $it")
        names.add("Таня")
    }
    with(names) {
        println("Список имен: $this")
        add("Аня")
    }
}