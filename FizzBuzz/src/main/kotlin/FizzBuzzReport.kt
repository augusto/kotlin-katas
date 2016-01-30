package fizzbuzz


class FizzBuzzReport(val fizzBuzzedSeq: Sequence<String>) {
    private val groupBy: Map<String, Int>

    init {
        groupBy = fizzBuzzedSeq.groupBy { x ->
            if (x.matches("^\\d+$".toRegex())) "integer"
            else x
        }.mapValues { list -> list.value.count() }
    }

    fun getGroupBy(): Map<String, Int> {
        return groupBy
    }

    fun getFizz(): Int {
        return groupBy.get("fizz") ?: 0
    }

    fun getBuzz(): Int {
        return groupBy.get("buzz") ?: 0
    }

    fun getFizzBuzz(): Int {
        return groupBy.get("fizzbuzz") ?: 0
    }

    fun getLucky(): Int {
        return groupBy.get("lucky") ?: 0
    }

    fun getInteger(): Int {
        return groupBy.get("integer") ?: 0
    }

    override fun toString(): String {
        val template = "%s\n" +
                "fizz: %d\n" +
                "buzz: %d\n" +
                "fizzbuzz: %d\n" +
                "lucky: %d\n" +
                "integer: %d";

        val fizzBuzzedSeqAsString = fizzBuzzedSeq.joinToString(" ")

        return template.format(fizzBuzzedSeqAsString,
                getFizz(),
                getBuzz(),
                getFizzBuzz(),
                getLucky(),
                getInteger())
    }
}