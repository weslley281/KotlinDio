package funcoes

data class Person(var name: String, var age: Int, var about:String){
    constructor() : this("", 0, "")
}

fun main(){
    val fulano = Person()
    val stringDescription = fulano.apply {
        name = "Fulano"
        age = 27
        about = "Mobile Developer"
    }.toString()

    println(stringDescription)
}