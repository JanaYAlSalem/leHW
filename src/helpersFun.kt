fun getmiddleNumber( num1 : Double ,num2 : Double ,num3 : Double ) { // extend Example 4

    var num1 = 0
    var num2 = 0
    var num3 = 0



    println("the Middle is ")

    if(num1 >= num2 && num1 <=num3){ // if 1 is middle
        println("$num1")}
    else
        if(num2 >= num1 && num2 <=num3){ // if 2 is middle
            println(" $num2")}
        else
            if(num3 >= num1 && num3 <=num2){ // if 3 is middle
                println("$num3")}

} // end getmiddleNumber fun