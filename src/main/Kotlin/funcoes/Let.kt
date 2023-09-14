package funcoes

fun customPrint(s: String){
    print(s.uppercase())
}

fun main(){
    val empty = "teste".let {
        customPrint(it)
        it.isEmpty()
    }

    println(" está vazio: $empty")

    fun printNomNull(str: String?){
        println("Mostrando \"$str\":")

        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?){
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNomNull(null)
    printNomNull("minha string")
    printIfBothNonNull("Primeiro","Segundo")
}