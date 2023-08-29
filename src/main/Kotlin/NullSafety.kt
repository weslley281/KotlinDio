fun main(){
    var neverNull: String = "Isso não pode ser nulo";
    //neverNull = null;

    var nullable: String? = "Isso pode ser nulo";
    nullable = null;

    var inferredNonNull = "O compilador assume como não-nulo"
    //inferredNonNull = null;

    fun strLength(notNull: String): Int {
        return notNull.length ?: 0
    }

    strLength(neverNull)
    //strLength(nullable)
}