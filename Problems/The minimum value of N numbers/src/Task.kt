import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var num = 0
    var num_aux = scanner.next().toInt()
    num = num_aux
    repeat(n-1)
    {
        var num_aux2 = scanner.next().toInt()
        if (num_aux2 <= num_aux){
            num_aux=num_aux2
            num = num_aux2
        }
    }
    println(num)
}
