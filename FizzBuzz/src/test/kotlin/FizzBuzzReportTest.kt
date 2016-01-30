package fizzbuzz


import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzReportTest {
    @Test
    fun shouldGenerateReport() {
        val fizzBuzzedSeq = sequenceOf(
                "1", "2", "lucky", "4", "buzz", "fizz", "7", "8", "fizz", "buzz",
                "11", "fizz", "lucky", "14", "fizzbuzz", "16", "17", "fizz", "19", "buzz"
        )

        val fizzBuzzReport = FizzBuzzReport(fizzBuzzedSeq)

        val expectedReport =
                "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz\n" +
                        "fizz: 4\n" +
                        "buzz: 3\n" +
                        "fizzbuzz: 1\n" +
                        "lucky: 2\n" +
                        "integer: 10"

        println(fizzBuzzReport.getGroupBy())

        assertThat(fizzBuzzReport.toString()).isEqualTo(expectedReport)
    }
}