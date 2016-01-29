package fizzbuzz


object Main {
    @JvmStatic
    fun main(vararg args: String) {
        val fizzBuzz = FizzBuzz()

        val integers = (1..20).toArrayList()
        val fizzBuzzed = fizzBuzz.of(integers)
        println(fizzBuzzed)
    }
}

class FizzBuzz {
    fun of(integers: List<Int>): List<String> {
        return integers.map({ x -> transform(x) })
    }

    private fun transform(x: Int): String {
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

fun StringBuilder.reset(): StringBuilder {
    this.setLength(0)
    return this;
}
