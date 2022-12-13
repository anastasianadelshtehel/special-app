import java.time.LocalDateTime
import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello")
    println("Program arguments: ${args.joinToString()}")

    fun doctavka(){
        println("выберите пункт доставки")
        val n=Random.nextInt()
        println("Дом доставки $n")
    }
}