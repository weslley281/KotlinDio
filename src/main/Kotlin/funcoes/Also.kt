data class Person(var name: String, var age: Int, var about:String){
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Person){
    println("Uma nova pessoa ${p.name} foi criada")
}

fun main(){
    val fulano = Person("Fulano", 30, "Android Developer").also { writeCreationLog(it) }
}