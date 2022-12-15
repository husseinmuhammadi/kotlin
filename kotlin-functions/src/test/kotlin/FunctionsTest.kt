import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FunctionsTest {
    @Test
    fun `call a function`() {
        val result = double(2)
        assertEquals(4, result)
    }

    @Test
    fun `call function with variable number of arguments`() {
        val result = asList(items = *arrayOf("a", "b", "c"))
        println("$result")

        val result2 = asList(1, 2, 3)
        println("$result2")
    }

    /**
     * If you want to pass a primitive type array into vararg, you need to convert it to a regular (typed) array using the toTypedArray() function
     */
    @Test
    fun `primitive type array`() {
        val a = intArrayOf(1, 2, 3) // IntArray is a primitive type array
        val list = asList(-1, 0, *a.toTypedArray(), 4)
        println("$list")
    }

    @Test
    fun `single-expression functions`() {
        val result = increment(2)
        assertEquals(3, result)
    }
}