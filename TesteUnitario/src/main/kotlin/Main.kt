
fun countXO(str: String): Boolean {

    val strLower = str.lowercase()

    var i = 0

    var countX = 0
    var countO = 0

    while (i < strLower.length) {
        if(strLower[i] == 'x'){
            countX ++
        }else if (strLower[i] == 'o'){
            countO ++
        }
        i++
    }

    return countO == countX && countO != 0

}

fun abc(): Boolean {
//
//    throw NullPointerException("Message to error")
    val str: String? = null
    return str!!.length == 0

}

fun portaria(idade: Int, tpConvite: String, cod: String): String {
    if (idade < 18) {
        return "Negado."
    }

    if (tpConvite != "") {
        val tipoConvite = tpConvite.lowercase()

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            return "Negado."
        }

        if (cod != "") {
            val codigo = cod.lowercase()
            return if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                "Welcome."
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")) {
                "Welcome."
            } else {
                "Negado."
            }
        }
    }
    return "Negado."
}


fun main() {

    println(countXO("xxoo"))
    println(countXO("xxxo"))
//    println(countXO("aa"))

}


