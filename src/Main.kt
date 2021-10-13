
import java.util.Scanner
fun main() {

    // Question 1
    println("Question 1")
    println("")
    print("Choose the operation (+,-,*,/ or % ) : ")
    var op = readLine()!! //readLine()

    print("Please Enter first number :")
    var num1 = readLine()!!.toInt() //readLine()

    print("Please Enter second number :")
    var num2 = readLine()!!.toInt() //readLine()

    if (op == "+") {
        println("Result of " + num1 + " + " + num2 + " = "+(num1+num2))
    }
    else if (op == "-") {
        println("Result of " + num1 + " - " + num2 + " = "+(num1-num2))
    }
    else if (op == "*") {
        println("Result of " + num1 + " * " + num2 + " = "+(num1*num2))
    }    else if (op == "/") {
        println("Result of " + num1 + " / " + num2 + " = "+(num1/num2))
    } else if (op == "%") {
        println("Result of " + num1 + " % " + num2 + " = "+(num1%num2))
    }


    // Question 2
    println("")
    println("")
    println("Question 2")
    println("")
    print("Please enter the salary of employee : ")
    var salary = readLine()!!.toDouble() //readLine()

    print("Performance rating by 1,2 or 3:")
    var perfo = readLine()!!.toInt() //readLine()


    if (perfo == 1) {
        println("The new salary of employee is " + ((salary+(salary*6)/100)))
    }
    else if (perfo == 2) {
        println("The new salary of employee is " + ((salary+(salary*4)/100)))
    }
    else if (perfo == 3) {
        println("The new salary of employee is " + ((salary+(salary*1.5)/100)))
    }


}
