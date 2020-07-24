import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var numAux = scanner.next().toInt()
    var ehOrdem = "YES"
    for (i in 1 until n) {
        val numAux2 = scanner.next().toInt()
        if (numAux + 1 == numAux2  || numAux == numAux2) {
            ehOrdem = "YES"
        } else {
            ehOrdem = "NO"
            break
        }
        numAux = numAux2
    }
    println(ehOrdem)
}