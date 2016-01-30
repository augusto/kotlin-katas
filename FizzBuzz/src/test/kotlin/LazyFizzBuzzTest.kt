package fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test as test

class LazyFizzBuzzTest {
    val lazyFizzBuzz = FizzBuzz();

    @test fun shouldReturnNumberIfDoesNotMatchAnyRules() {
        val fizzBuzzed = lazyFizzBuzz.lazy(sequenceOf(7))
        assertThat(fizzBuzzed.toList()).containsOnly("7");
    }

    @test fun shouldReturnFizzForMultipleOfThree() {
        val fizzBuzzed = lazyFizzBuzz.lazy(sequenceOf(6))
        assertThat(fizzBuzzed.toList()).containsOnly("fizz");
    }

    @test fun shouldReturnBuzzForMultipleOfFive() {
        val fizzBuzzed = lazyFizzBuzz.lazy(sequenceOf(5))
        assertThat(fizzBuzzed.toList()).containsOnly("buzz");
    }

    @test fun shouldReturnFizzBuzzForMultipleOfThreeAndFive() {
        val fizzBuzzed = lazyFizzBuzz.lazy(sequenceOf(15))
        assertThat(fizzBuzzed.toList()).containsOnly("fizzbuzz");
    }

    @test fun shouldReturnLuckyForNumbersWhichContainAThree() {
        val fizzBuzzed = lazyFizzBuzz.lazy(sequenceOf(30))
        assertThat(fizzBuzzed.toList()).containsOnly("lucky");
    }
}