package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var namaDepan = "Muchammad"
    var namaBelakang = "Raharjo W"
    val umur :Int = 21
    val single: Boolean = true
    val notsingle: Boolean = false

    println("nama Depan :$namaDepan")
    println("nama Belakang :$namaBelakang")
    println("umur :$umur")
    println("status :$notsingle")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */


fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    println("group :$groupId")
    println(groupMember)
    println(session)
    return arrayOf(groupId, groupMember, session)

}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
val myGroup ="Muchammad Raharjo W"
    return myGroup
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Reza", "Sani", "Ardy")
    val countOfGroup = 4

    return mentor.count() + countOfGroup

}

fun main() {

    myProfile()

    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail( 5, listOf("joo", "ilham", "there", "yeverson"), "Afternoon")

}