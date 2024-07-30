fun main() {

    var firstname = "Linet"
    var lastname = "Kabue"


    println(firstname)
    //accessing a character in a string
    println(firstname[1])

    // modifying a string
    println(firstname.uppercase())
    println(lastname.lowercase())

    // string concatenation - joining strings

    println(firstname + lastname)
    println(firstname.plus(lastname))
    println(firstname +" "+ lastname)

    //string Interpolation
    println("My firstname is "+firstname)
    println("My firstname is $firstname")

    var num1 = 34
    var num2 =20

    println("The sum of $num1 and $num2 is"+ (num1+num2))

}