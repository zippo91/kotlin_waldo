package ch03

import strings.join
import strings.joinToString
import strings.lastChar


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    val list1 = listOf("one", "two", "three")

    println(list.joinToString(seperator = "; ", postfix = ")", prefix = "("))
    print(list1.join(" "))
    //함수에 전달하는 인자의 이름을 명시(하나를 명시하면 전부를 명시해야 한다

    println("Waldo".lastChar())
    val sb = StringBuilder("Kotlin~")
    sb.lastChar = '!'
    println(sb)

    val view: View = Button()
    view.click()

    view.showOff()
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

