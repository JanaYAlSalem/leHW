import java.io.File

fun main() {

    // PART I
    // Create a list of city's
    var ListOfCitys = mutableListOf("Riyadh", "New York", "Berlin")

    // Add 2 city's
    ListOfCitys.addAll(listOf("Moscow", "London"))

    //  update last element to "Madrid"
    ListOfCitys[ListOfCitys.indexOf(ListOfCitys.last())] = "Madrid"

    // Print the whole list with the numbers
    for (item in ListOfCitys) {
        var index = ListOfCitys.indexOf(item)
        println("$index - $item")
    }

    println("=====================")

    // PART II
    // Create a list of Numbers
    var ListOFNumber = mutableListOf(7,3,0,5,1)

    //update the 3th element to 12
    ListOFNumber[ListOFNumber.indexOf(ListOFNumber.get(2))] = 12

    // delete the element with value 12 if existing
    ListOFNumber.removeAll(listOf(12))

    // print the list
    println(ListOFNumber)

    println("=====================")

    // PART Options
   // Create a text file and read it
    var NumberFile = File("data/Maximum.txt").readText().split("/n")
    println(NumberFile)
    println("=====================")

    // Create a list of 10 number
    var MaximumNumberFile = NumberFile.toMutableList()

    // return the maximum number

}

