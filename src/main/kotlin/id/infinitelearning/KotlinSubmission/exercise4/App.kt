package id.infinitelearning.KotlinSubmission.exercise4

import javax.naming.InvalidNameException

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    val age = 16;
    try {

        try {
            validateAge(age)
        } catch (e: AgeNotValidException) {
            println(e.message)
        }
    } catch (e: Exception) {
        println(e.message)
    }
}

fun validateAge(age: Int) {
    if (age < 17 || age > 100) {
        throw AgeNotValidException("umur anda tidak cocok untuk menaiki wahana ini")
    }
}

class AgeNotValidException
    (message: String) : Exception(message)
