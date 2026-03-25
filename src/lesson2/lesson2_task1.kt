package lesson2

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Enter your age: ")
    val userAge = readln()
    val age = userAge.toIntOrNull() ?: 0

    val result: Boolean = age >= AGE_OF_MAJORITY

    if (result) {
        println("You are old enough")
    } else {
        println("You are too young")
    }

    println(result)
}