fun main(args: Array<String>) {
//Doubler program parsing
    println("Enter a number and I'll double it: ")
    val input = readLine()!!
    var a = input.toInt() // eventually Double
    a = a * 2
    println(a)
    println("Enter a number, and I'll square it:")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)

    /**
     * Untuk merubah nilai String yang dikembalikan oleh fungsi readLine()!! kedalam nilai yang
    diinginkan bisa dilakukan dengan menggunakan konversi secara eksplisit
     */
}