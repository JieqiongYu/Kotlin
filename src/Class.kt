fun main(args: Array<String>) {

    // Classes
    class Dog(name: String, age: Int, furColor: String, weight: Double) {
        var name = name
        var age = age
        var furColor = furColor
        var weight = weight

        fun info() {
            println("$name is $age years old, has $furColor fur and is $weight lbs!")
        }
    }

    var myDog = Dog("Brian", 6, "Brown", 14.5)
    println(myDog.name)
    myDog.info()

    var otherDog = Dog("Sarah", 17, "White",12.3)
    println(otherDog.age)
}