package id.infinitelearning.KotlinSubmission.exercise2

fun main() {


    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val angka1 = mutableListOf<Int>()
    val angka2 = mutableListOf<Int>()

    for (i in 1..100)
    if (i % 2 == 0)
        angka1.add(i)

    for (i in 1..100)
    if (i % 2 == 1)
        angka2.add(i)

    println("Bilangan genap :$angka1")
    println("Bilangan ganjil :$angka2")







    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini

    val bulan = hashMapOf(
        "Jan" to "Januari",
        "Feb" to "Februari",
        "March" to "Maret",
        "Apr" to "April",
        "May" to "Mei",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "August" to "Agustus",
        "Sep" to "September",
        "Oct" to "Oktober",
        "Nov" to "November",
        "Dec" to "Desember",
    )

    println(" -- nama bulan -- ");
    bulan.forEach { k, v ->
        println("$k -> $v") }

    println(" -- bulan sekarang dan bulan lahir -- ");
    val monthNow = mutableMapOf<String, String>()
    for ((k, v) in bulan) {
        if (k.startsWith("O")) {
            monthNow[k] = v
        }
    }
    val birthMonth = mutableMapOf<String, String>()
    for ((k, v) in bulan) {
        if (k.startsWith("Jul")) {
            birthMonth[k] = v
        }
    }

    println("It's $monthNow now, I was born in $birthMonth")

}