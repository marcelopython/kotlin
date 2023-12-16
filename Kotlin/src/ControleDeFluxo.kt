
fun main(){

    val num = 30

    if(num > 20 ){
        println("Numero maior que 20")
    }else{
        println("Numero menor que 20")
    }

    if(num in 100..50){
        println("esta dentro do intervalo de numero")
    }

    val returnWhen = when(num){
        20 -> "meu teste when"
        10 -> "meu teste when 2"
        else -> "Default value"
    }

    println(returnWhen)


    for (i in 0..20 step 2){
        print("$i ")
    }
    println()
    val str = "kotlin é show!"

    for (char in str){
        print(" $char")
    }

    println()

    for (s in 20 downTo 0 step 3){
        print("$s ")
    }
    println()

    var ist = 0
    while (ist <= 100){
        print("v $ist")
        ist++
    }





}



