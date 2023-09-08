package Colecoes

val openIssues: MutableSet<String> = mutableSetOf("descrição1", "descrição1", "descrição1")

fun addIssue(descripton: String): Boolean{
    return openIssues.add(descripton)
}

fun getStatusLog(isAdded: Boolean): String{
    return if (isAdded) "registrado corretamente" else "nom registrado corretamente"
}

fun main(){
    val aNewIssue: String = "descrição1"
    val  anIssueAlreadyIn: String = "descrição2"

    println("Problema $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Problema $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}