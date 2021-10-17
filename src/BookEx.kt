

const val username = "Jana" // ch2: write a  Declaring a compile-time constant

fun main() { // ch2: write " main " + tab : create fun with types

    var ss: Int = 6
    ss += 4
    println(ss)

    println(username)


    // ch5 Anonymous Functions, it should get vac. by calculate age
    val AgeFunctionBoolen: (Int) -> Boolean = { age -> age >= 50 // if output is booleen

    }
    println(AgeFunctionBoolen(40))

    // ch5 multiple arguments Functions, it should get vac.? by calculate age and return name
    val AgeFunction: (Int,String) -> String = { age,name -> //age >= 50 // if output is booleen
        if (age <= 40)
           "$name get vac. please"
        else
           "$name you should get vac."
    }
    println(AgeFunction(24, "Jana"))

}// end main

