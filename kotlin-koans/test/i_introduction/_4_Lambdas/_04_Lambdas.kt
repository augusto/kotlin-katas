package i_introduction._4_Lambdas

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class _04_Lambdas() {
    @Test fun contains() {
        assertTrue(task4(listOf(1, 2, 3, 126, 555)))
    }

    @Test fun notContains() {
        assertFalse(task4(listOf(44)))
    }
}