package topics

/**
 * @author Vladislav Karmazin
 */
fun main() {
    testWhen(1)
    testWhen("Hello")
}

// testWhen(Object object)
fun testWhen(input: Any){
//    input.length // не обязательно может быть length

    when (input){
        1 -> println("Единица")
        2 -> println("Двойка")
        in 10..20 -> println("От 10 до 20")
        is String -> "Была введена строка ${input.length}" // Уже точно length
        else -> "Что-то еще"
    }
}