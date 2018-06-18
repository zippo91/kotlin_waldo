package ch02.smartcast

/**
 * @author waldo:Athens , zippo91@coupang.com
 * @since 2018. 6. 17..
 */

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr) : Int {
    if(e is Num) {
        val n = e as Num
        return n.value
    }
    if(e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalRefactorying(e: Expr) : Int =
    when(e) {
        is Num ->
                e.value
        is Sum ->
                eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e: Expr) : Int =
        when(e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("num: $left + $right")
                left + right
            }
            else ->
                throw IllegalArgumentException("Unknown expression")
        }