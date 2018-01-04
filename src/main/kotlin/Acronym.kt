object Acronym {

    fun generate(phrase: String): String {
        return phrase.getAcronym()
    }


    private fun String.getAcronym():String{
        return this.split(" ", "-").joinToString("") { it.substring(0, 1).toUpperCase() }
    }

}