class MutableStack<E>(vararg items: E){
    private val elements = items.toMutableList();

    fun push(element: E) = elements.add(element);

    fun peek(): E = elements.last();

    fun pop(): E = elements.removeAt(elements.size - 1);

    fun isEmpity() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutabeStack(${elements.joinToString()})"
}

fun main(){
    val stack = MutableStack("Fulano", "Cicrano", "Deltrano")
    stack.push("Maltrano")
    println(stack)

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()){
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}