import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FunctionsTest {
    @Test
    fun `call a function`() {
        val result = double(2)
        assertEquals(4, result)
    }

    @Test
    fun `call function with vararg parameters`() {
        foo(strings = *arrayOf("a", "b", "c"))
    }


}