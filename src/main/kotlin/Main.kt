import java.time.LocalDateTime
import kotlin.random.Random

fun main(args: Array<String>) {
    println("Hello")
    println("Program arguments: ${args.joinToString()}")

    fun doctavka(){
        println("выберите пункт доставки")
        println("Дом доставки ${Random.nextInt()}")
        println("Дом доставки ${Random.nextInt()}")
    }
}