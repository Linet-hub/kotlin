//Area of a rectangle
// A = L * W

import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter length of rectangle :")
    var length = read.nextInt()
    println("Enter width of rectangle : ")
    var width = read.nextInt()

    var area = (length * width)
    println("The area of the rectangle is $area")
}