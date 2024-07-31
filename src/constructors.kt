class Dog(var name:String,var breed:String,var color:String){

}

fun main() {
    var dog1 = Dog("Bob","German shepherd","White")
    println(dog1.name + " " + dog1.breed + " " + dog1.color )

    var dog2 = Dog("Puf","Chiwawa","Black")
    println(dog2.name + " " + dog2.breed + " " + dog2.color )

    var dog3 = Dog("kolly","syberian Husky","Black")
    println(dog3.name + " " + dog3.breed + " " + dog3.color )


}