/**
 * The String is ever double quote
 */


/**
 * in Kotlin, the type 'Unit' represents a function without a return value
 */
fun printMessage(message: String): Unit {
    println(message)
}

/**
 * The function has parameters 'message' and 'prefix', both of which are String object
 * The parameter 'prefix' has a default value of "info"
 * The function does not have a return type
 */
fun printMessageWithPrefix(message: String, prefix: String = "Info") {

    println("[$prefix] $message")

}

/**
 * witch -> sendo
 * botch -> ambos
 * The function has parameters 'x' and 'y', both of witch are Int object
 * The function returns an Int type
 * The Logic of the function is to sum two numbers of type Int: represented as X + y
 */
fun sum(x: Int, y: Int): Int {

    return x + y

}

/**
 * A single-expression function that returns an integer (inferred)
 **/
fun multiply(x: Int, y: Int) = x * y

/**
 * Main, function principal
 */
fun main() {

    printMessage("Hello word")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")

    /***
     * When passing a named parameter, you should pass the remaining parameters as named as well, if any.
     */
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    println(sum(10, 20))

    println(multiply(10, 20))

}

