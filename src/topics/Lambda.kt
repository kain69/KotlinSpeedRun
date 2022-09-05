package topics

/**
 * @author Vladislav Karmazin
 */
fun main() {
    val a = listOf(1,2,3,4,5)

    a.forEach { e -> println(e) }
    println( a.map { e -> e * 2 } )
    a.filter { e -> e % 2 == 0 }
    println( a.reduce { sum, e -> sum + e} ) // sum()

    a.sorted() // сортировка
    a.sortedByDescending { it } // сортировка по убыванию или по геттеру it.getAge

    a.any { it > 10 } // Возвращает true, если хоть один элемент удовлетворяет условию
    a.all { it > 10} // Возвращает true, если все элементы удовлетворяет условию
    a.sum() // Суммирует все элементы

    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 } // Разделяет на два списка по условию

    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length } // Сгруппирует все строки по длине
    println(result)
    // Результат HashMap, где в качестве ключей длинны , а в качестве значения массив строк
}

