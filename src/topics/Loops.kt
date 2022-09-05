package topics

/**
 * @author Vladislav Karmazin
 */
fun main() {
    // for each
    val items = listOf("apple", "banana", "orange") // List.of() Java 9
    mutableListOf("apple", "banana", "orange") // ArrayList

    for (item in items)
        println(item)

    // while
    var index = 0
    while (index < items.size){
        println("Item at $index is ${items[index]}")
        index++
    }

    // Диапозоны (как в Python)
    println(5 in 1..10) // true

    for(i in 1..10) // 1 <= .. <= 10
        println(i)

    for (i in 1 until 10) // 1 <= .. < 10
        println(i)

    for(i in 10 downTo 1) // Обратный порядок
        println(1)

    for(i in 0 .. 100 step 10) // Шаг
        println(i)

}