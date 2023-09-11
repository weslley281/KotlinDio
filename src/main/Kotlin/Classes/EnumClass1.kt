package Classes

enum class State {
    IDLE, RUNNING, FINESHED
}

fun main() {
    val state = State.RUNNING
    val message = when (state){
        State.IDLE -> "Está parado"
        State.RUNNING -> "Está rodando"
        State.FINESHED -> "Está Finalizado"
    }

    println(state)
    println(message)
}