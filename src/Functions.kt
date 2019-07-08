fun main(args: Array<String>) {
    // Functions

    fun hello() {
        println("Hello World!")
    }

    println("Hi!")
    hello()

    fun addAndPrint(number1: Int, number2: Int): Int {
        return number1 + number2
    }
    var sum: Int = addAndPrint(4, 5)
    println(sum)

    fun dogInfo(name: String, age: Int) {
        println("$name is $age years old :)")
    }

    dogInfo("Fido", 8)
    dogInfo("Sarah", 22)
}