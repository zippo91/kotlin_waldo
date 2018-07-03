package ch02.geometry

import ch02.color.enum.ColorType
import ch02.geometry.shapes.createRandomRectangle
import java.util.*

/**
 * @author waldo:Athens , zippo91@coupang.com
 * @since 2018. 6. 17..
 */

fun main(args: Array<String>) {
    var rectangle = createRandomRectangle()
    println("width: ${rectangle.width}, height: ${rectangle.height}")
    println(rectangle.isSquare)

    println(mix(ColorType.RED, ColorType.YELLOW))

    for(i in 1..50) {
        print(fizzBuzz(i))
    }
    println()

    for(i in 50 downTo 1 step 2) {
        print(fizzBuzz(i))
    }

    val binaryMaps = TreeMap<Char, String>()

    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryMaps.put(c, binary) //binaryMaps[c] = binary

    }

    for((letter, binary) in binaryMaps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for((index, element) in list.withIndex()) {
        println("$index = $element")
    }

    println(isLetter('b'))
    println(isNotDigit('b'))
    println(recognize('b'))

}

fun mix(c1: ColorType, c2: ColorType) = when(setOf(c1, c2)) {
    setOf(ColorType.RED, ColorType.YELLOW) -> ColorType.ORANGE
    setOf(ColorType.YELLOW, ColorType.BLUE) -> ColorType.GREEN
    setOf(ColorType.BLUE, ColorType.VIOLET) -> ColorType.INDIGO
    else -> throw Exception("Dirty color")
}

fun getMnemonic(colorType: ColorType) = when(colorType) {
    ColorType.RED -> "Richard"
    ColorType.ORANGE -> "Of"
    ColorType.YELLOW -> "York"
    ColorType.GREEN -> "Gave"
    ColorType.BLUE -> "Battle"
    ColorType.INDIGO -> "In"
    ColorType.VIOLET -> "Vain"
}

fun getWarmth(colorType: ColorType) = when(colorType) {
    ColorType.RED,
    ColorType.ORANGE,
    ColorType.YELLOW -> "warm"
    ColorType.GREEN -> "neutral"
    ColorType.BLUE,
    ColorType.INDIGO,
    ColorType.VIOLET -> "cold"
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c) {
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    in '0'..'9' -> "It's a digit"
    else -> "I don't know"
}