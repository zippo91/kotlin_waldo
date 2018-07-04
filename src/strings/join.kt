package strings

fun <T> Collection<T>.joinToString(
        seperator: String = ", ",   //default값 설정
        prefix: String = "",    //default값 설정
        postfix: String = ""    //default값 설정
): String {
    val result = StringBuilder(prefix)

    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(seperator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}

fun Collection<String>.join(
        seperator: String = ", ",   //default값 설정
        prefix: String = "",    //default값 설정
        postfix: String = ""    //default값 설정
) = joinToString(seperator, prefix, postfix)