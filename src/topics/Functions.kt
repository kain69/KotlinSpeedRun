package topics

/**
 * @author Vladislav Karmazin
 */
fun main() {
    println(testSimple1())
    println(testSimple2())
    println(testSimple3(1,2))
    println(testSimple4(1))
    println()

    println(testNamedArguments(4,2,5))
    println(testNamedArguments(y = 4, x = 2, z = 5))
    println()

    testDefaultArguments(3,4)
    testDefaultArguments(y = 4)
    testDefaultArguments(x = 1)
    testDefaultArguments(1)

    printEven(0, 1, 2, 3, 4)
    // * - подставляет элементы массива в vararg
    printEven(*intArrayOf(1,2,3,4,5), 6, 7)
}

fun testSimple1(): Int {
    return 5 + 5
}

fun testSimple2(): Int = 5 + 5

// fun testSimple3(x:Int, y: Int): Int = x + y
fun testSimple3(x : Int, y: Int) = x + y

fun testSimple4(x:Int): String{
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

// void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false){
    (if (toUpperCase) name.toUpperCase() else name) + number
}

// vararg

//fun printEven(x: List<Int>){
//
//}

fun printEven(vararg numbers: Int){
    numbers.forEach { n -> if (n % 2 == 0) println(n) }
}