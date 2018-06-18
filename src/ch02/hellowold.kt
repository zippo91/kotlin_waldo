package ch02

/**
 * @author waldo:Athens , zippo91@coupang.com
 * @since 2018. 6. 17..
 */

fun main(args: Array<String>) {
    println("Hello, World!")

    val name = if(args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name!")

    if(args.isNotEmpty()) {
        println("Hello, ${args[0]}!")
    }

    println("Hello, ${if(args.isNotEmpty()) args[0] else "someone"}!")
}