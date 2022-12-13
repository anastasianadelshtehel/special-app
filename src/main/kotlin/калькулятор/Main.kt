package калькулятор

fun main() {

    while (true) {
        println("Введите первое число")
        val a = readLine()?.toDoubleOrNull()

        println("Введите второе число")
        val b = readLine()?.toDoubleOrNull()

        println("Выберите оператор(+, -, *, /)")
        val operator = readLine()

        if (a == null || b == null || operator.isNullOrEmpty()) {//null или пустаея
            println("Введите другое число")
        } else {
            val result = calculate(a, b, operator)
            println("Ответ: $result")
        }
    }

}

fun calculate(a: Double, b: Double, operator: String): Double {
    var res: Double = 0.0

    when (operator) {
        "+" -> res = a + b
        "-" -> res = a - b
        "*" -> res = a * b
        "/" -> res = a / b
    }
    return res
}

