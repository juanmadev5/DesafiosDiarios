package desafios

fun NucleotidCount(): String {

    val sequence = "INVALID"

    val nucleotides = "ACGT"
    val count = mutableListOf(0,0,0,0) // 0: A, 1:C, 2:G, 3:T

    sequence.forEach {
        if(it !in nucleotides) {
            println("error")
            return "error"
        }
        when(it) {
            'A' ->  count[0] += 1
            'C' ->  count[1] += 1
            'G' ->  count[2] += 1
            'T' ->  count[3] += 1
        }
    }
    val result = "A: ${count[0]}, C: ${count[1]}, G: ${count[2]}, T: ${count[3]}"
    println(result)
    return result
}