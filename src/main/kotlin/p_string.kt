fun main(args: Array<String>) {
    val myName: String = "Depandi Enda"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    /**
     * String merupakan array dari karakter dan bersifat immutable (bersifat statis). Elemen suatu
    String dapat diakses dengan operasi indeks array contoh s[i] atau dengan menggunakan for-loop.
     */

    var text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin()
    println(text)

    var teks = """
        for (c in "foo")
        print(c)
    """
    println(teks)
}