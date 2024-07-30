// a simple program to tell whether a letter is a vowel or a consonant

import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    print("Enter a letter: ")
    val letter = readln()?.toLowerCase()?.get(0) ?: return

    if (letter in "aeiou") {
        println("$letter is a vowel.")
    } else {
        println("$letter is a consonant.")
    }


}