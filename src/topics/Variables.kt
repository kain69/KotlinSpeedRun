package topics

/**
 * @author Vladislav Karmazin
 */
// Константы - val
// Переменный var
// Имя: Тип
// Тип писать не обязательно
fun main() {
    val test1 = "Hello"
//    test1 = "Goodbye" // Ошибка

    var test2: String = "Hello"
    test2 = "Goodbye"
//    test2 = 1 // Ошибка, Kotlin всё еще строго типизированный

    println("Value of test2 $test1")
    println("Sum is ${2 + 2}")
    val test3 = 1
    val test4 = 2
    println("Sum is ${test3 + test4}")


}