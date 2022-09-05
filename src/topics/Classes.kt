package topics

/**
 * @author Vladislav Karmazin
 */
fun main() {
    val p1 = Person("Vlad", "Karmazin", 22)
    val c1 = Person("Bob", "Bobbie", 10)
    val p2 = Person("Not Vlad", "Not Karmazin", 22, c1)
    print(p1.firstName)

    val r1 = Rectangle(5.0,5.0)
    println("Perimeter is ${r1.perimeter}")

    val r2 = Rectangle(5.0,5.0)
    println(r1 == r2) // true, потому что equals
}

// Primary constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int){
    // Поле
    var children: MutableList<Person> = mutableListOf() // ArrayList<Person>

    // Выполняется после инициализации полей
    init {
        println("Person is created ${firstName}")
    }

    // Вторичный конструктор всегда вызывает первичный
    constructor(firstName: String, lastName: String, age: Int, child: Person):
            this(firstName, lastName, age) {
        children.add(child)
    }

    // Конструктор без аргументов
    constructor(): this("","",-1)
}

// data - авто equals, hashcode, toString
data class Rectangle(var height: Double, var width: Double) {
    var perimeter = (height + width) * 2

    var test = 1
        get() = field + 1 // field == this.test
        set(value){
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * width
}