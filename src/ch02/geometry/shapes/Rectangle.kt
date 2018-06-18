package ch02.geometry.shapes

import java.util.Random

/**
 * @author waldo:Athens , zippo91@coupang.com
 * @since 2018. 6. 17..
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean get() {
        return height == width
    }
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}