

fun main(args: Array<String>){
    println("Love You Kotlin")

    /*val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    // val is immutable

    var x = 5 // `Int` type is inferred
    x += 1
    // var is mutable
    */


    // This is an end-of-line comment

/* This is a block comment
   on multiple lines. */

    /* variable lifetime
    var a = 1
    val s1 = "a is $a"
    println(s1)
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)*/

    // for conditional
//    println("Max value is: " + maxOf(100, 290))

    /*
    Null checking...
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")*/

    // Nested function
    /*fun printLength(obj: Any) {
        println("'$obj' string length is ${getStringLenght(obj) ?: "... err, not a string"} ")
    }

    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))*/

    // Loop
    /*val items = listOf("Apple", "Banana", "Capsicum", "Donut")
    for(item in items){
        println(item)
    }*/

    /*fun describe(obj: Any): String =
        when (obj) {
            1       -> "One"
            "Hello" -> "Greetings"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
    }

    println(describe(1))
    println(describe("Hello"))
    println(describe(5454545454545))
    println(describe(3))*/

    // Creating basic classes and their instances
    val rectangle = Rectangle(5.0, 2.0)
    val triangle = Triangle(3.0,  4.0, 5.0)

    println( "Area of rectangle is ${rectangle.calculateArea()}, its perimiter is ${rectangle.perimiter}")
    println("Area of a triangle is ${triangle.calculateArea()}, its perimiter is ${triangle.perimiter}")

}

fun maxOf(a: Int, b: Int): Int {
    if(a>b){
        return a;
    }else{
        return b;
    }
}

fun parseInt(str: String): Int?{
    return str.toIntOrNull()
}


fun printProduct(arg1: String, arg2: String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if(x != null && y != null){
        println(x * y)
    }else{
        println("either $arg1 or $arg2 is not a number ")
    }
}

fun getStringLenght(obj: Any): Int?{
    if(obj is String){
        return obj.length
    }

    return null
}

