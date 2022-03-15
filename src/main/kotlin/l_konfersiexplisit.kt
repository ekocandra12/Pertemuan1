fun main(args: Array<String>) {
    val valInt: Int = 1
    val valSum: Long = 3L + valInt //konversi implisit
    println("Konversi variabel valInt secara implisit : " + valSum)
    val valLong: Long = valInt.toLong() // konversi eksplisit
    println("Konversi variabel valInt secara eksplisit : " + valLong)

    /**
     * Setiap Number di Kotlin mendukung konversi secara eksplisit seperti :
    toByte(): konversi ke Byte
    toShort():konversi ke Short
    toInt():konversi ke Int
    toLong():konversi ke Long
    toFloat():konversi ke Float
    toDouble():konversi ke Double
    toChar():konversi ke Char
     */
}