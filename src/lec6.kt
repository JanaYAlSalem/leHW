import kotlin.random.Random
import kotlin.random.nextInt

fun main() {


    // example of lambdas at ch5 on page 75

    val SubFun = { NameOfstu: String, IdOfstu: Int ->  // sub fun
        "name of $NameOfstu, and the id is $IdOfstu"
    }

    // calling superfun
    println(superFun("Jana", SubFun))

} // end main

fun superFun(NameofUn: String, SubFun: (String, Int) -> String): String {  // super fun
    var np = Random.nextInt(1..6)
    return "$NameofUn have a" + SubFun("jana ", np)


} // end super fun

