import java.util.Scanner
fun main() {
/*
    print("healthPoints ")
    var healthPoints = readLine()!!.toDouble() //readLine()

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()


when{
    karma in 0 .. 5 -> println("red")
    karma in 6 .. 10 -> println("orange")
    karma in 11 .. 15 -> println("purple")
    karma in 16 .. 20 -> println("green")
    else -> println("green")
} // end when
    */

    println("enter 3 numbers to order ")
    var num1 = readLine()!!.toDouble() //readLine()
    var num2 = readLine()!!.toDouble() //readLine()
    var num3 = readLine()!!.toDouble() //readLine()


    println("the order is ")
    if(num1 <= num2 && num1 <= num3){ // if 1 is smaller
        println("$num1")
        if (num2 <= num3)  {
            println("$num2")
            println("$num3") }
        else {
            println("$num3")
            println("$num2") }
    }
    else
        if(num2 < num1&& num2 <= num3){ // if 2 is smaller
            println("$num2")
            if (num1 <= num3)  {
                println("$num1")
                println("$num3") }
            else {
                println("$num3")
                println("$num1") }
        }
        else
            if(num3< num2&& num3<=num1){ // if 3 is smaller
                println("$num3")
                if (num1 <= num2)  {
                    println("$num1")
                    println("$num2") }
                else {
                    println("$num2")
                    println("$num1") }
            }


} // end main
