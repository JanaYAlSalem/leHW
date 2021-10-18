import kotlin.random.Random
import kotlin.random.nextInt

fun main() {


    // Q1 Anonymous Functions Example from the book

    // ch5 p67
    val numLetters = "It's function by providing an anonymous function".count({ letter ->
        letter == 'n'
    })
    println("The number of 'n' is :"+numLetters)

    // ch5 p68
    println(
        {
            val year = 2021
            "Hello we are on ($year) Year !!"
        }()
    )

    // to more shortest like page 69
    val PrintName: () -> String = {
        val NameOfT = "JANA"
        "Welcome $NameOfT"
    }
    println(PrintName())

    // The it keyword page 72
   var countA = "Jana AlSalem".count({ it == 'A' || it == 'a' })
     println("The number of 'a' is : $countA")


    // example of lambdas at ch5 on page 75
    val FunB = { NameOfstu: String, IdOfstu: Int ->  // sub fun
        "$NameOfstu, and the id is $IdOfstu"
    }

    // calling superfun
    println(FunA("Jana", FunB))


    // Q2 : write a exceptionexception code (throw)
    var x = 3
    if (x>=5)
        println(" it 5 or more")
    else
        throw Exception ("it is less than 5")

} // end main

fun FunA(NameofUn: String, SubFun: (String, Int) -> String): String {  // super fun
    var IdR = Random.nextInt(1..6)
    return "STU Name is " + SubFun("Jana ", IdR)


} // end super fun