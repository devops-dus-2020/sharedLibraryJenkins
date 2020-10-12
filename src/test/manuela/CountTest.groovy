package manuela.test

import org.junit.jupiter.api.*
import manuela.count.*

class TestCounting {

    @Test 
    public void NumberAfter1() {

        int expected = 2

        CountInterface stubCount = [ counting: { return 2 } ] as CountInterface
        CountKlasse count = new CountKlasse(stubCount)
        int actual = count.countFrom1()

        Assertions.assertEquals(expected, actual)

    }

}