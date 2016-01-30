package fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test as test

class EagerFizzBuzzTest {
    val eagerFizzBuzz = FizzBuzz();

    @test fun shouldReturnFizzForMultipleOfThree() {
        assertThat(eagerFizzBuzz.eager(arrayListOf(6))).isEqualTo(arrayListOf("fizz"));
    }

    @test fun shouldReturnBuzzForMultipleOfFive() {
        assertThat(eagerFizzBuzz.eager(arrayListOf(5))).isEqualTo(arrayListOf("buzz"));
    }

    @test fun shouldReturnNumberIfDoesNotMatchAnyRules() {
        assertThat(eagerFizzBuzz.eager(arrayListOf(7))).isEqualTo(arrayListOf("7"));
    }

    @test fun shouldReturnFizzBuzzForMultipleOfThreeAndFive() {
        assertThat(eagerFizzBuzz.eager(arrayListOf(15))).isEqualTo(arrayListOf("fizzbuzz"));
    }

    @test fun shouldReturnLuckyForNumbersWhichContainAThree() {
        assertThat(eagerFizzBuzz.eager(arrayListOf(30))).isEqualTo(arrayListOf("lucky"));
    }
}