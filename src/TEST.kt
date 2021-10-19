import java.util.Scanner
const val TAVERN_NAME = " Folly\"'s Taernyl's"
fun main() {
    placeOrder("tea,Dragon's Breath,5.91")
    println("HIkkkku\b ")



}
private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\"')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")
}
