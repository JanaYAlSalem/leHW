
fun main() {

     // Q1: chapter 3
    val name = "Madrigal"
    var healthPoints = 55
    val isBlessed = true
    val isImmortal = false
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()

    when{
        karma in 0 .. 5 -> println("red")
        karma in 6 .. 10 -> println("orange")
        karma in 11 .. 15 -> println("purple")
        karma in 16 .. 20 -> println("green")
        else -> println("green")
    } // end when


    // Q2: create non return value fun
    printInfo()

} // end main