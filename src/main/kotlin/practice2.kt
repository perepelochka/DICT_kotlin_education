
//  1 Функция, возвращающая "Even" или "Odd"
fun evenOrOdd(number: Int): String {
    return if (number % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
}
//fun main() {
// Вводим целое число
//print("Введите число: ")
// val number = readLine()?.toIntOrNull()
// Проверяем, что ввод был корректным числом
//if (number == null) {
//    println("Ошибка: введено некорректное значение")
//} else {
//  Вызываем функцию, возвращающую "Even для четных чисел" или "Odd для нечетных чисел"
//    val result = evenOrOdd(number)
//  Выводим результат
//    println("Задание 1: $result")

//2 функция, умножающая заданное число на 4, если оно четное и на 5 если нечетное.
fun multiplyBy(number: Int): Int {
    return if (number % 2 == 0) {
        number * 4
    } else {
        number * 5
    }
}
//fun main() {
// Вводим целое число
//print("Введите число: ")
// val number = readLine()?.toIntOrNull()
// Проверяем, что ввод был корректным числом
//if (number == null) {
//    println("Ошибка: введено некорректное значение")
//} else {
//  Вызываем функцию, возвращающую "Even для четных чисел" или "Odd для нечетных чисел"
//    val result = evenOrOdd(number)
//  Выводим результат
//    println("Задание 1: $result")
// Вызываем функцию, умножающую число на 4 или 5 в зависимости от его четности
//val result2 = multiplyBy(number)
// Выводим результат
//println("Результат 2: $result2")

// 3 Функция, возвращающая негативное число введенного значения
fun negateNumber(number: Int): Int {
    return -number
}
//fun main() {
// Вводим целое число
//print("Введите число: ")
// val number = readLine()?.toIntOrNull()
// Проверяем, что ввод был корректным числом
//if (number == null) {
//    println("Ошибка: введено некорректное значение")
//} else {
//  Вызываем функцию, возвращающую "Even для четных чисел" или "Odd для нечетных чисел"
//    val result = evenOrOdd(number)
//  Выводим результат
//    println("Задание 1: $result")
// Вызываем функцию, умножающую число на 4 или 5 в зависимости от его четности
//val result2 = multiplyBy(number)
// Выводим результат
//println("Результат 2: $result2")
// Вызываем функцию, возвращающую негативное число введенного значения
//val result3 = negateNumber(number)
// Выводим результат
//println("Результат 3: $result3")

// 4 Функция, которая определяет столетие, соответствующее введеному году
fun calculateCentury(Year: Int): Int {
    return (Year + 99) / 100
}
//fun main() {
    // Вводим целочисленное значение
//    print("Введите год: ")
//    val Year = readLine()?.toIntOrNull()

    // Проверяем, что ввод был корректным числом
//    if (Year == null) {
//        println("Ошибка: введено некорректное значение")
//    } else {
        // Вызываем функцию, определяющую столетие
//        val result = calculateCentury(Year)
        // Выводим результат
//        println("Результат: $result")
//    }


// 5 Функция, которая находит самое маленькое число
fun findSmallestNumber(numbers: Array<Int>): Int {
    var smallestNumber = numbers[0]
    for (number in numbers) {
        if (number < smallestNumber) {
            smallestNumber = number
        }
    }
    return smallestNumber
}
//fun main() {
//    print("Введите числа через пробел: ")
//    val input = readLine()
 //   val numbers = input?.split(" ")?.map { it.toInt() }?.toTypedArray()
 //   if (numbers != null) {
 //       val smallestNumber = findSmallestNumber(numbers)
//        println("Наименьшее число: $smallestNumber")
 //   } else {
 //       println("Вы не ввели числа")
 //   }
//}


// 6 Функция, которая находит 2 самых больших числа
fun findTwoLargestNumbers(numbers: IntArray): Pair<Int, Int> {
    var firstLargest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE
    for (number in numbers) {
        if (number > firstLargest) {
            secondLargest = firstLargest
            firstLargest = number
        } else if (number > secondLargest) {
            secondLargest = number
        }
    }
    return Pair(firstLargest, secondLargest)
}
//fun main() {
//  val numbers = intArrayOf(13, 75, 90, 0, 87)
//  val largestNumbers = findTwoLargestNumbers(numbers)
// println("Наибольшие числа: ${largestNumbers.first} и ${largestNumbers.second}")
//}


//7 Функция, которая находит кол-во положительных и сумму отриц. чисел
fun countPositiveAndSumNegative(numbers: Array<Int>?): Array<Int> {
    if (numbers == null || numbers.isEmpty()) {
        return arrayOf(0, 0)
    }
    var positiveCount = 0
    var negativeSum = 0
    for (number in numbers) {
        if (number > 0) {
            positiveCount++
        } else if (number < 0) {
            negativeSum += number
        }
    }
    return arrayOf(positiveCount, negativeSum)
}
//fun main() {
//    val arr = arrayOf(-2, 5, 20, -8, 3, -1)
//    val result = countPositiveAndSumNegative(arr)
//    println("Количество положительных чисел: ${result[0]}")
//    println("Сумма отрицательных чисел: ${result[1]}")
//}

//8 функция, которая считает кол-во гласных букв в строке
fun countVowels(str: String): Int {
    val vowels ="AEIOUYaeiouy"
    var count = 0
    for (char in str) {
        if (char in vowels) {
            count++
        }
    }
    return count
}
//fun main() {
//    val str ="Good day!"
//    val vowelsCount = countVowels(str)
//    println("Количество гласных букв в строке '$str' равно $vowelsCount.")
//}

//9 функция, возвращающая средний символ
fun findMiddleChar(str: String): String {
    val middleIndex = str.length / 2
    if (str.length % 2 == 0) {
        return str.substring(middleIndex - 1, middleIndex + 1)
    } else {
        return str.substring(middleIndex, middleIndex + 1)
    }
}
//fun main(){
//    val str1 = "test"
//    val str2 = "A"
//    val str3= "Fun"
//    println("Средний символ в строке '$str1' равен '${findMiddleChar(str1)}'.")
//    println("Средние символы в строке '$str2' равны '${findMiddleChar(str2)}'.")
//    println("Средние символы в строке '$str3' равны '${findMiddleChar(str3)}'.")

//}

//10 функция для создания таблицы умножения nxn
fun multiplicationTable(n: Int) {
    for (i in 1..n) {
        for (j in 1..n) {
            print("${i*j}\t")
        }
        println()
    }
}
fun main() {
    multiplicationTable(4)
}