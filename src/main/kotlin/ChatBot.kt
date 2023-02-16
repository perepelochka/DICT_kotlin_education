import java.util.*

fun main(args: Array<String>) {

    //1 задание
    println("Hello!My name is Kotlin_Bot.\n" +
            "Please, remind me your name.")

    print(" ")
    val name = readLine()
    println("What a great name you have, $name!")

    //2 задание
    println("Let me guess your age.\n" + "Enter remainders of dividing your age by 3, 5 and 7.")
    val scan = Scanner(System.`in`)
    val remainder3 = scan.nextInt()
    val remainder5 = scan.nextInt()
    val remainder7 = scan.nextInt()
    val age = remainder3 * 70 + remainder5 * 21 + remainder7 * 15 % 105
    println("Your age is $age!")

    //3 задание
    println("Now I will prove to you that I can count to any number you want.")
    val number: Int = scan.nextInt()
    for (i in 0 until number + 1) {
        println("$i!")
        if (i == number) {
            println("Done!")
        }
    }


}



