

operator fun Int.times(str: String) = str.repeat(this)
println(2 * "Bye " )


operator fun String.get(range: IntRange) = substring(range)

val str = "Alwals forgive enemies; nothing annoys them so much."

println(str[0..14])