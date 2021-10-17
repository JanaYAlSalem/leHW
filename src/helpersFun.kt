fun getmiddleNumber( num1 : Double ,num2 : Double ,num3 : Double ) { // extend Example 4

    println("the Middle is ")
    if((num2 >= num1 && num3 >= num1)|| (num3 >= num1 && num1 > num2)){ // if 1 is middle
        println("$num1")}
   else
    if((num1 >= num2 && num3 >= num2)|| (num3 >= num2 && num2 > num1)){ // if 2 is middle
            println(" $num2")}
    else
    if((num2 >= num3 && num1 >= num3)|| (num1 >= num3 && num3 > num2)){ // if 3 is middle
                println("$num3")}

} // end getmiddleNumber fun

fun getOrderNumber( num1 : Double ,num2 : Double ,num3 : Double ) { // extend Example 3


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

} // End getOrderNumber fun


fun printInfo () {

    println("Name : Jana")
    println("age : 23")
    println("email : JanaAlSalem@outlook.sa")




}


