fun <E> multableStackOf(vararg elements: E) = MutableStack(*elements)

fun main(){
    val stack = multableStackOf("Fulano", "Cicrano", "Deltrano")
    stack.push("Maltrano")
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}