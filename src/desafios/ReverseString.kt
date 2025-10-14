package desafios

fun reverseString(input: String = "aeiou") {
    val maxIndex = input.length - 1

    var newString = ""

    for(i in maxIndex downTo 0) {
        newString += input[i]
    }
    println(newString)
}