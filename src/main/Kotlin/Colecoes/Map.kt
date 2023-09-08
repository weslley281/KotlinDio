package Colecoes

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 1000)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointCredit(accountId: Int){
    if (EZPassAccounts.containsKey(accountId)){
        println("Updating $accountId")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    }else{
        println("Error: Trying to update, nom existing acont id:$accountId")
    }
}

fun accountsReport(){
    println("EZ-Pass report: ")
    EZPassReport.forEach {
        k, v -> println("Id $k: credit $v")
    }
}

fun main(){
    accountsReport()
    updatePointCredit(1)
    updatePointCredit(1)
    updatePointCredit(5)
    accountsReport()
}