

infix fun Int.times(str: String) = str.repeat(this)



fun main(){

    //infix fun Int.times(str: String) = str.repeat(this)

    println(2 times "Bye ")


    val pair = "Ferrari" to "Katrina"

    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)




}


class Person(val name: String) {



}




