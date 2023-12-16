
fun main(){

    var s: String? = null

    s?.let {
        it.lowercase()
        it.length
        // corpo
        // scope funciton
    }

    // logic
    println(s ?: "Nulo")
    println(s?.length)
    println("asdfasdfadf")

    // vamos assumir o erro !!
    //println(s!!.length)
//    Null safety -> previne erros nas variavel quando forem nulas e da meios para corrigir ou assumir o erro
//    var abc = readLine()
//    println(abc!!.length)
//    println(abc?.length)

    try {
        // vamos assumir o erro !!
        println(s!!.length)

    }   catch (e: NullPointerException){

        println("variavel nulla")

    } catch (e: Exception){
        println("Exception")
    } finally {
        println("Finally exception")
    }

    println("Fim")






}



