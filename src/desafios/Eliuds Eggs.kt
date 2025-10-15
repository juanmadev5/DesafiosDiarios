package desafios

import kotlin.math.pow

fun EliudsEggs() {
    val eggs = listOf("", "", "", "E", "", "", "")
    var binaryRepresentation = ""
    var decimalCount = 0

    eggs.forEach {
        binaryRepresentation += if (it == "E") {
            "1"
        } else {
            "0"
        }
    }

    val reversedBinary = binaryRepresentation.reversed()

    var currentExp = 0

    reversedBinary.forEach { charDigit ->
        val digitValue = charDigit.toString().toInt()

        val powerOfTwo = 2.0.pow(currentExp.toDouble())

        val valueToAdd = digitValue * powerOfTwo

        decimalCount += valueToAdd.toInt()

        currentExp += 1
    }

    println(decimalCount)
}