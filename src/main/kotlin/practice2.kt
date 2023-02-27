
// Основная функция программы
fun main() {
    // Вводим целое число
    print("Введите число: ")
    val number = readLine()?.toIntOrNull()

    // Проверяем, что ввод был корректным числом
    if (number == null) {
        println("Ошибка: введено некорректное значение")
    } else {
        // Вызываем функцию, возвращающую "Even для четных чисел" или "Odd для нечетных чисел"
        val result = evenOrOdd(number)
        // Выводим результат
        println("Задание 1: $result")
        // Вызываем функцию, умножающую число на 4 или 5 в зависимости от его четности
        val result2 = multiplyBy(number)
        // Выводим результат
        println("Задание 2: $result2")
        // Вызываем функцию, возвращающую негативное число введенного значения
        val result3 = negateNumber(number)
        // Выводим результат
        println("Задание 3: $result3")
    }
}

// Функция, возвращающая "Even" или "Odd"
fun evenOrOdd(number: Int): String {
    return if (number % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
}
fun multiplyBy(number: Int): Int {
    return if (number % 2 == 0) {
        number * 4
    } else {
        number * 5
    }
}
// Функция, возвращающая негативное число введенного значения
fun negateNumber(number: Int): Int {
    return -number
}
