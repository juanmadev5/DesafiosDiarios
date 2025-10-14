package desafios


/**
 * the conjecture claims that no matter the starting number, we'll always end at 1.
 *
 * If it's even, divide it by 2.
 * If it's odd, multiply it by 3 and add 1.
 * 12 ➜ 6 ➜ 3 ➜ 10 ➜ 5 ➜ 16 ➜ 8 ➜ 4 ➜ 2 ➜ 1
 * Counting from the second number (6), it took 9 steps to reach 1
 * */
fun CollatzConjeture(input: Int) {

    var num = input
    var steps = 0

    while (true) {
        if (num == 1) {
            break
        }
        if (num % 2 == 0) {
            num /= 2
            steps += 1
        } else {
            num = (num * 3) + 1
            steps += 1
        }
    }

    println("Takes $steps steps to reach in 1")
}