package i_introduction._6_Data_Classes

import org.junit.Test
import org.junit.Assert.assertEquals


public class _06_Data_Classes {
    @Test fun testListOfPeople() {
        assertEquals("[Person(name=Alice, age=29), Person(name=Bob, age=31)]", task6().toString())
    }
}