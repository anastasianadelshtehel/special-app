import java.time.LocalDateTime

fun main(args: Array<String>) {
    println(LocalDateTime.now())
    println("Program arguments: ${args.joinToString()}")
}