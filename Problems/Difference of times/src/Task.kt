import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val m1 = scanner.nextInt()
    val s1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val m2 = scanner.nextInt()
    val s2 = scanner.nextInt()
    val hora1 = (h1 * 3600) + (m1 * 60) + s1
    val hora2 = (h2 * 3600) + (m2 * 60) + s2
    println(hora2-hora1)
}
