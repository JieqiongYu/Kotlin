fun main(args: Array<String>) {
    // Arrays and Lists
    var topCandy = listOf("Snickers", "Fun Dip", "MilkyWay")
    println(topCandy[1])

    var topBooks: Array<String> = arrayOf("Snickers Book", "Fun Dip Book", "MilkWay Book")
    println(topBooks[1])

    var topFlower: List<String> = listOf("Snicker Flower", "Fun Dip Flower", "MilkWay Flower")
    var topMutableFlower: MutableList<String> = mutableListOf("Snickers Mutable Flower")
    println(topMutableFlower[0])
    topMutableFlower.add(0, "Black Thunder")
    println(topMutableFlower[0])
}