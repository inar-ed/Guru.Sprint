package lesson2

const val AGE_OF_MAJORITY = 18

fun main() {
//    println("Enter your age: ")
//    val userAge = readln()
//    val age = userAge.toIntOrNull() ?: 0
//
//    val result: Boolean = age >= AGE_OF_MAJORITY
//
//    if (result) {
//        println("You are old enough")
//    } else {
//        println("You are too young")
//    }
//
//    println(result)

    println("Введите возраст : ")
    val userAge2 = readln()
    val age2 = userAge2.toIntOrNull() ?: 0

    val result2: Boolean = age2 >= AGE_OF_MAJORITY

    if (result2) {
        println("Добро пожаловать!")
    } else {
        println("Иди гуляй! Не дорос еще Алихан")
    }

    println(result2)
    
    
    
}