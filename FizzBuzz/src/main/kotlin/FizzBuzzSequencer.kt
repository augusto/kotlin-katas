package fizzbuzz

class FizzBuzzSequencer(val integers: Sequence<Int>) : Sequence<String> {

    override fun iterator(): Iterator<String> {
        return integers.map { x -> fizzBuzzedNumber(x) }.iterator()
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
