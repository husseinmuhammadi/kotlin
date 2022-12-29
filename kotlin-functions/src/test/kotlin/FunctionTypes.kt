import org.junit.jupiter.api.Test

class FunctionTypes {
    @Test
    fun `function types`() {
        val onClick: () -> Unit = { }
        val supplier: () -> Int = {
            1
        }
        val supplier2: () -> String = {
            val greeting = "Hello"
            greeting
        }
        val consumer: (Int) -> Unit = { x: Int ->
            println("$x")
        }

        consumer(2)

        val consumer2 = { x: String ->
            println("x: $x")
            println("x: $x")
        }

        consumer2("Hello")
    }

    @Test
    fun `type alias`(){
        typealias Predicate = String -> Boolean
    }

}
