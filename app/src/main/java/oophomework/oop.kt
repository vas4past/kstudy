package oophomework

import android.os.Parcel
import android.os.Parcelable

// Создайте класс Car с полями model, color, year и методом drive(). Создайте несколько объектов этого класса и вызовите их метод drive().
class Car(val model: String, val color: String, val year: Int) {
    fun drive() {
        println("Машина $model цвета $color $year года едет.")
    }
}


//Создайте enum class DayOfWeek, содержащий все дни недели. Выведите все дни недели, используя свойства values и name этого enum
enum class DayOfWeek(val char: String, val names: String) {

    FIRST("рабочий", "понедельник"),
    SECOND("рабочий", "вторник"),
    THIRD("рабочий", "среда"),
    FOURTH("рабочий", "четверг"),
    FIFTH("рабочий", "пятница"),
    SIXTH("выходной", "суббота"),
    SEVENTH("выходной", "воскресенье")
}

//Создайте объект Singleton с методом printMessage(), который выводит любое сообщение. Вызовите этот метод.
object Singleton {
    fun printText() {
        println("Синглтон, который пишет сообщение")
    }
}

//Создайте класс Person с приватными свойствами name, age и публичными методами getName() и getAge(). Проверьте, что прямой доступ к этим свойствам невозможен извне класса.
class PersonOne(private var name: String, private var age: Int) {

    fun getName(): String {
        return name
    }

    fun getAge(): Int {
        return age
    }
}

//В классе Person добавьте custom геттеры и сеттеры для свойств name и age. Убедитесь, что вы можете управлять доступом к этим свойствам извне класса. Например, вы можете реализовать проверку возраста в сеттере, чтобы убедиться, что возраст неотрицательный.
class PersonTwo() {
    var name: String = "Unknown"
        set(value) {
            println("Устанавливаем имя - $value")
            field = value
        }
        get() {
            print("Имя - ")
            return field
        }
    var age: Int = 0
        set(value) {
            if (value < 0) {
                println("Возраст не может быть отрицательным!")
            } else {
                println("Устанавливаем возраст $value")
                field = value
            }
        }
        get() {
            print("Возраст - ")
            return field
        }
}

//Создайте класс Animal с методом makeSound(), затем создайте классы Dog и Cat, наследующие от Animal, и переопределите метод makeSound(). Создайте объекты Dog и Cat и вызовите их методы makeSound().
open class Animal {
    open fun makeSound() {
        println("Животное издает звуки")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Собака лает")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Кошка мяукает")
    }
}

//Создайте класс MathUtils и перегрузите функцию add(), чтобы она могла принимать два или три целых числа.
class MathUtils() {
    fun add(x: Int) {
        println("Добавили число $x")
    }

    fun add(x: Int, y: Int) {
        println("Добавили число $x и число $y")
    }
}

//Создайте абстрактный класс Shape с абстрактным методом area(), затем создайте классы Circle и Rectangle, реализующие этот метод. Создайте объекты Circle и Rectangle и выведите их площадь.
abstract class Shape {
    abstract fun area()
}

class Cirle(var radius: Int) : Shape() {
    private val pi = 3.14
    override fun area() {
        var s = radius * pi * radius
        println("Площадь круга равна $s")
    }
}

class Rectangle(var a: Int, var b: Int) : Shape() {
    override fun area() {
        var s = a * b
        println("Площадь прямоугольника равна $s")
    }
}

//Создайте интерфейс Flyable с методом fly() и интерфейс Navigable  с методом navigate(), затем создайте классы Bird и Airplane,
//реализующие эти интерфейсы. Создайте объекты Bird и Airplane и вызовите их методы fly() и navigate().

interface Flyable {
    fun fly()
}

interface Navigable {
    fun navigate()
}

class Bird : Flyable {
    override fun fly() {
        println("Птица летает с помощью крыльев")
    }
}

class Airplane : Navigable {
    override fun navigate() {
        println("Самолет летает с помощью навигации")
    }
}

//Создайте data class User с двумя свойствами и методом printInfo(), который выводит информацию о пользователе.
//Создайте объект User и вызовите его метод printInfo().
data class User(val name: String, val age: Int, val sex: String) {
    fun prinInfo() {
        println("Юзер - это $name, его возраст = $age, пол - $sex")
    }
}

//Создайте sealed class MathOperation и несколько объектов, представляющих различные математические операции (например, Add, Subtract, Multiply, Divide).
// Создайте функцию, которая принимает MathOperation и два числа, и выполняет соответствующую операцию.
sealed class MathOperation {
    object Add : MathOperation()
    object Subtract : MathOperation()
    object Multiply : MathOperation()
    object Divide : MathOperation()
}

fun calculate(operation: MathOperation, a: Double, b: Double): Double {
    var result = 0.0
    if (operation is MathOperation.Add) {
        result = a + b
        println("Cложение: $result")
    } else if (operation is MathOperation.Subtract) {
        result = a - b
        println("Вычитание: $result")
    } else if (operation is MathOperation.Multiply) {
        result = a * b
        println("Умножение: $result")
    } else if (operation is MathOperation.Divide) {
        result = a / b
        println("Деление: $result")
    }
    return result
}

//Создайте два класса: Mammal и CanFly. В классе Mammal определите метод breastfeed(), а в классе CanFly - метод fly().
// Затем создайте класс Bat, который сочетает в себе оба этих поведения (с помощью композиции).
open class Mammal {
    open fun breastfeed() {
        println("Кормит молоком")
    }
}

open class CanFly {
    open fun fly() {
        println("Летает")
    }
}

class Bat() {
    private var mammal: Mammal = Mammal()
    private var canFly: CanFly = CanFly()

    fun breastfeed() {
        mammal.breastfeed()
    }

    fun canFly() {
        canFly.fly()
    }
}

//Создайте классы Engine и Tires. Затем создайте класс Car, который получает Engine и Tires через конструктор (Dependency Injection)
interface Engine {
    fun drivesCar()
}

interface Tires {
    fun moveCar()
}

class PetrolEngine : Engine {
    override fun drivesCar() {
        println("Бензин приводит машину в движение")
    }
}

class DieselEngine : Engine {
    override fun drivesCar() {
        println("Дизель приводит машину в движение")
    }
}

class SummerTires : Tires {
    override fun moveCar() {
        println("Движется на летней резине")
    }
}

class WinterTires : Tires {
    override fun moveCar() {
        println("Движется на зимней резине")
    }
}

class CarDI(private val engine: Engine, private val tire: Tires) {
    fun cardrive() {
        engine.drivesCar()
        tire.moveCar()
        println("Вот так едет машина")
    }
}

//Создайте обобщенный интерфейс Repository<T>, который содержит методы для сохранения (save(item: T)),
// удаления (delete(item: T)) и получения всех элементов (getAll(): List<T>).
// Реализуйте этот интерфейс в классе UserRepository для работы с объектами класса User.

interface Repository<T> {
    fun save(item: T)
    fun delete(item: T)
    fun getAll(): List<T>
}

data class User1(
    val age: Int,
    val name: String
)

class UserRepository<T> : Repository<T> {
    private val myusers = ArrayList<T>()

    override fun save(item: T) {
        myusers.add(item)
    }

    override fun delete(item: T) {
        myusers.remove(item)
    }

    override fun getAll(): List<T> {
        return myusers.toList()
    }
}

fun main() {
    val myCar1 = Car("Audi 100", "красный", 1988)
    val myCar2 = Car("Kia Ceed", "синий", 2008)
    val myCar3 = Car("Kia Rio", "красный", 2012)

    myCar1.drive()
    myCar2.drive()
    myCar3.drive()

    for (day in DayOfWeek.values()) {
        println("${day.names} - это ${day.char} день.")
    }

    Singleton.printText()

    val person = PersonOne("Вася", 33)
    //println(person.name)
    //println(person.age)
    println(person.getAge())
    println(person.getName())

    val vasya = PersonTwo()
    vasya.name = "Василий"
    vasya.age = -12
    vasya.age = 33
    println(vasya.name)
    println(vasya.age)

    val dog = Dog()
    val cat = Cat()
    println(cat.makeSound())
    println(dog.makeSound())

    val mathutils = MathUtils()
    mathutils.add(5)
    mathutils.add(4, 12)

    val krug = Cirle(5)
    krug.area()
    val kvadrat = Rectangle(2, 6)
    kvadrat.area()

    val chaika = Bird()
    val su = Airplane()
    chaika.fly()
    su.navigate()

    val vlad = User("Влад", 26, "мужской")
    vlad.prinInfo()

    val a = 12.0
    val b = 4.0

    val sum = calculate(MathOperation.Add, a, b)
    val difference = calculate(MathOperation.Subtract, a, b)
    val product = calculate(MathOperation.Multiply, a, b)
    val quotient = calculate(MathOperation.Divide, a, b)

    val bat = Bat()
    bat.breastfeed()
    bat.canFly()

    val engine = PetrolEngine()
    val tires = SummerTires()
    val engine2 = DieselEngine()
    val tires2 = WinterTires()
    val car = CarDI(engine, tires)
    val car2 = CarDI(engine2, tires2)
    car.cardrive()
    car2.cardrive()

    val userRepo: Repository<User1> = UserRepository()
    val user = User1(21, "Иван Иванов")
    val user2 = User1(33, "Тамара Петрова")

    println(userRepo.getAll())
    userRepo.save(user)
    userRepo.save(user2)
    println(userRepo.getAll())

    userRepo.delete(user)
    println(userRepo.getAll())
}



