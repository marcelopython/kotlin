import kotlin.math.*


// enter pointer

fun main(){

    helloWord()

    val soma = sum(10, 5)

    println("A soma de 10 e 5 e $soma")

    println(divisao(10f, 3.5f))

    var str = "Programação kotlin."

    println("Tamanho da string ${str.length}")
    println("Posição 0 da string: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2, 5))
    println(str.replace("kotlin.", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())

    println("  Meu nome e ".trim())

    println("Funções matematicas")

    println(max(5, 10))
    println(min(5, 10))
    println(sqrt(45.67f))
    println(PI)
    println(E)
    println(round(23234234234.234234))

    println("Media")

    println(media(1f, 2f, 3f, 4f, 76f, 8f, "asdf", false))


    arrayOf(2, 2, 2, 2, 2, 2, 't', "teste")

    // Any, Unit e Nothing


}

fun valores (value: Any): Unit{

}

// Generic
fun <T> media(vararg notas: T): Float {
    var soma = 0f
    for( n in notas){

        if(n is Float){

            soma += n

        }else if(n is String){

            println(n)

        }
    }
    return (soma / notas.size)
}


fun divisao(a: Float, b: Float) = a/b

fun sum(a: Int, b: Int): Int  = a + b


fun helloWord() {
    println("Hello, world!")
}

