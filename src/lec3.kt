import java.util.Scanner
fun main() {


    // Example 1
    println("Enter number of apple ")

    var appleNO = readLine()!!.toInt() //readLine()
    var appleD = 0
    var reApple = 0

    appleD = appleNO / 12
    reApple = appleNO % 12

    println(appleD)
    println(reApple)

} // end main