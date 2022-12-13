import java.time.LocalDateTime

fun main(args: Array<String>) {
    println(LocalDateTime.now())
    println("Hello")
    println("Program arguments: ${args.joinToString()}")
}