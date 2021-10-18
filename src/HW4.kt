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




    val greetingFunction: () -> String = {
        val currentYear = 2018
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }

}