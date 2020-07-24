import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    var totalA = a.toLong()
    for (i in a+1 until b) {
         totalA *= i
    }
    println(totalA)
}
