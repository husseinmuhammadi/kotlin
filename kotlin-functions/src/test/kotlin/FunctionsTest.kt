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
    }

    @Test
    fun `single-expression functions`() {
        val result=increment(2)
        assertEquals(3, result)
    }
}