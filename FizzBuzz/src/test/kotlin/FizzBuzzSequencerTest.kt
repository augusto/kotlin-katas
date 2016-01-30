import fizzbuzz.FizzBuzzSequencer
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class FizzBuzzSequencerTest {
    @Test fun shouldReturnNumberIfDoesNotMatchAnyRules() {
        val fizzBuzzSeq = FizzBuzzSequencer(sequenceOf(7));
        assertThat(fizzBuzzSeq.toList()).containsOnly("7");
    }

    @Test fun shouldReturnFizzForMultipleOfThree() {
        val fizzBuzzSeq = FizzBuzzSequencer(sequenceOf(6));
        assertThat(fizzBuzzSeq.toList()).containsOnly("fizz");
    }

    @Test fun shouldReturnBuzzForMultipleOfFive() {
        val fizzBuzzSeq = FizzBuzzSequencer(sequenceOf(5));
        assertThat(fizzBuzzSeq.toList()).containsOnly("buzz");
    }

    @Test fun shouldReturnFizzBuzzForMultipleOfThreeAndFive() {
        val fizzBuzzSeq = FizzBuzzSequencer(sequenceOf(15));
        assertThat(fizzBuzzSeq.toList()).containsOnly("fizzbuzz");
    }

    @Test fun shouldReturnLuckyForNumbersWhichContainAThree() {
        val fizzBuzzSeq = FizzBuzzSequencer(sequenceOf(30));
        assertThat(fizzBuzzSeq.toList()).containsOnly("lucky");
    }
}