package fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test as test

class FizzBuzzTest() {
    val fizzBuzz = FizzBuzz()

    @test fun shouldReturnFizzForMultipleOfThree() {
        assertThat(fizzBuzz.of(arrayListOf(6))).isEqualTo(arrayListOf("fizz"));
    }

    @test fun shouldReturnBuzzForMultipleOfFive() {
        assertThat(fizzBuzz.of(arrayListOf(5))).isEqualTo(arrayListOf("buzz"));
    }

    @test fun shouldReturnNumberIfDoesNotMatchAnyRules() {
        assertThat(fizzBuzz.of(arrayListOf(7))).isEqualTo(arrayListOf("7"));
    }

    @test fun shouldReturnFizzBuzzForMultipleOfThreeAndFive() {
        assertThat(fizzBuzz.of(arrayListOf(15))).isEqualTo(arrayListOf("fizzbuzz"));
    }

    @test fun shouldReturnLuckyForNumbersWhichContainAThree() {
        assertThat(fizzBuzz.of(arrayListOf(30))).isEqualTo(arrayListOf("lucky"));
    }
}