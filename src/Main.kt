import java.util.Scanner

fun main() {
    println("Enter number of apple ")
    var appleNO = readLine()!!.toInt() //readLine()
    var appleD = 0
    var reApple = 0


    appleD = appleNO / 12
    reApple = appleNO % 12

    println(appleD)
    println(reApple)



//sum()
} // end main

/*
fun sum (){
    var x = 2
    var y = 3
    var r = x+y
    println(r)
} // end fun*/