fun main(args: Array<String>) {
    printMessage("Olá mundo")
    printMessageWithPrefix("Olá mundo 2")
    println(sum(5,8))
    println(multiply(5,8))
}

fun printMessage(message: String): Unit{
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int{
    return x + y;
}

fun multiply(x: Int, y: Int) = x * y