fun double(x: Int): Int {
    return 2 * x
}

fun powerOf(number: Int, exponent: Int): Int {
    return 0
}

/**
 * Variable number of arguments (varargs)
 * You can mark a parameter of a function (usually the last one) with the vararg modifier
 */
fun <T> asList(vararg items: T): List<T> {
    val result = ArrayList<T>()
    for (item in items) // ts is an Array
        result.add(item)
    return result
}

/**
 * Single-expression functions
 * When a function returns a single expression, the curly braces can be omitted and the body is specified after a = symbol
 */
fun increment(x: Int): Int = x + 1

