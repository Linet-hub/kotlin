fun main() {
    //predefined functions
    println("eMobilis")

    var squareroot = Math.sqrt(144.0)
    println("The squareroot is $squareroot")

    var round = Math.round(32.89)
    println("The result is $round")

    var myceil = Math.ceil(45.67)
    println("The result is $myceil")

    month()
    multiply()
    student("Neema",19)
    student("Makena",18)


}

//User-defined functions

fun month(){
    println("The month is july")
}

fun multiply(){
    var num1 = 20
    var num2 = 5
    println(num1 * num2)
}
//Parameter and arguments

fun student(name:String,age:Int){
    println("$name is $age years old")

}