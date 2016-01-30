package fizzbuzz


object EagerMain {
    @JvmStatic
    fun main(vararg args: String) {
        val fizzBuzz = FizzBuzz()

        val integers = (1..20).toArrayList()
        val fizzBuzzed = fizzBuzz.eager(integers)
        println(fizzBuzzed)
    }
}

object LazyMain {
    @JvmStatic
    fun main(vararg args: String) {
        val fizzBuzz = FizzBuzz()

        println("FizzBuzzing numbers")
        val integers = (1..20).asSequence()
        val fizzBuzzed = fizzBuzz.lazy(integers)
        println("Printing fizzbuzzed sequence")
        println(fizzBuzzed.joinToString(" "));
    }
}

class FizzBuzz {
    fun eager(integers: List<Int>): List<String> {
        return integers.map({ x -> fizzBuzzedNumber(x) })
    }

    fun lazy(integers: Sequence<Int>): Sequence<String> {
        return integers.map { x ->
            println("lazy")
            fizzBuzzedNumber(x)
        }
    }

    private fun fizzBuzzedNumber(x: Int): String {
        val sb = StringBuilder()
        if ( x % 3 == 0) sb.append("fizz")
        if ( x % 5 == 0) sb.append("buzz")
        if ( x.toString().contains("3")) {
            sb.reset().append("lucky")
        }
        if ( sb.isEmpty()) sb.append(x)

        return sb.toString()
    }
}
