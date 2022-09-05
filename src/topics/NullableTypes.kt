package topics

/**
 * @author Vladislav Karmazin
 */
fun main() {
    var a: String = "Hello"
//    a = null  // NPE исключен

    var b: String? = "Hello"
    b = null

//    b.length // Ограничение, чтобы не было NPE. Только safe calls

    // safe call

    // Вернет длину b, если null -> null (Не будет NPE)
    b?.length

    // bob?.department?.head?.name -> null, если хоть один вызов вернёт null (Не будет NPE)

    // Elvis оператор - ?:
    val l = b?.length ?: -1 // если в b строка, в l её длина. Если нет то в l будет -1

    b = if ((0..1).random() > 0) "asdf" else null
    // !! оператор - выбрасывает NPE, если в переменной null
    val t = b!!.length


}