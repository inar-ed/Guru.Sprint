fun main() {
    val secret = "password"
    var input: String

    do {
        println("Введите пароль:")
        input = readLine().toString()
    } while (input != secret)

    println("Пароль верный!")
}