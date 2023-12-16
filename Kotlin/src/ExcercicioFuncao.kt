
// enter pointer
fun main(){

    //https://github.com/DevMasterTeam/Udemy-Andorid-Kotlin/blob/master/Secao%2006%20-%20Funcoes/Reforce%20seu%20aprendizado%20-%20Fun%C3%A7%C3%B5es.pdf

    infoYear(2)

    val totalString = returnTotalCaracteres("Marcelo silva")
    println("O tamando da string e: $totalString")

    println(calcCub(12,3,5))

    val milhas = 10.0f
    val km = convertMiEmKm(milhas)
    println("O total de milhas $milhas equivale a $km Quilometros")

    println(replaceStr("Marcelo silvA rodrigrues"))

}

fun replaceStr(str: String): String = str.replace("A", "X", true).toUpperCase()

fun convertMiEmKm(milhas: Float): Float{

    val defaultKm: Float = 1.609344f

    return milhas * defaultKm

}

fun calcCub(n: Int, n2: Int, n3: Int): Int = n * n2 * n3


fun infoYear(year: Int) {

    println("$year anos equivalem a:")

    val months = year * 12;
    println("$months meses")

    val days = months * 30
    println("$days dias")

    val hours = days * 24
    println("$hours Horas")

    val minuts = hours * 60
    println("$minuts Horas")

    val secounds = minuts * 60
    println("$secounds Horas")

}

fun returnTotalCaracteres(str: String): Int = str.length
