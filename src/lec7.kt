import java.io.File

fun main() {

    // create list
    var ListOfName = mutableListOf("Noura", "Ibrahim", "Sare")
    println(ListOfName)
    println("=====================")
    // add on the first of lis new item
    ListOfName.addAll(0, listOf("Zamel", "Sadun"))
    println(ListOfName)
    println("=====================")
    // add myself in the list
    ListOfName.add(2, "JANA")
    println(ListOfName)
    println("=====================")
    // update names
    ListOfName[0] = "Eng. Mohamed Zamel"
    ListOfName[1] = "Eng. Hussien Sadun"
    println(ListOfName)
    println("=====================")
    // remove any eng.
    ListOfName.removeAll { it.contains("Eng.") }
    println(ListOfName)
    println("=====================")
    // update items to stu.
    for (item in ListOfName) {
    ListOfName[ListOfName.indexOf(item)] = "STU $item"
    }
    println(ListOfName)
    println("=====================")
    // Read from ex file
    var  readfile= File("data/input.txt").readText().split("/n")
    println(readfile)
    println("=====================")
    // update from ex file
    var updateFIle = readfile.toMutableList()
    updateFIle.add("Amjad")
    println(updateFIle)
}
