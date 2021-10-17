import java.util.Scanner
fun main() {

    // Example1

    var cUser =true

    println("Choose 1- to order nubers OR 0- to get the middle number ")
    var cUserN = readLine()!!.toInt()!!

    println("enter 3 numbers to  get $cUser ")
    var numfunorder1 = readLine()!!.toDouble() //readLine()
    var numfunorder2 = readLine()!!.toDouble() //readLine()
    var numfunorder3 = readLine()!!.toDouble() //readLine()

if (cUserN !== 1 )
     cUser = false


    chUser(numfunorder1,numfunorder2,numfunorder3,cUser)

    // Example 2
    println(
        {
            val mm = 99
            " mumber ($mm)"
        }()
    )

} // end main

fun chUser ( num1 : Double ,num2 : Double ,num3 : Double ,cUser : Boolean = true ): Boolean {
    return if (cUser) {
        getOrderNumber(num1, num2, num3)
        true
    } else {
        getmiddleNumber(num1, num2, num3)
        false
    }}


