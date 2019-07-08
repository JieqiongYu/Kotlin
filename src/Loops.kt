fun main(args: Array<String>) {
    for (count in 1..1_000) {
        println(count)
    }

    var topCandy : MutableList<String> = mutableListOf("Snickers", "Fun Dip", "MilkyWay")
    for (candy in topCandy) {
        println(candy)
    }
}