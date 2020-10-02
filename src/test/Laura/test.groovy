package laura.test

import org.junit.jupiter.api.*
import static groovy.test.GroovyAssert.shouldFail
import laura.devopsdus2020.*
import laura.details.*


class NumberGeneratorTest{
 
    @Test
    void instanciates()
    {
        NumberGenerator uut = new NumberGenerator(null);
    }

    @Test
    void shouldGenerateNumbers() {
        int expected = 1
        int actual  
        def generator = [generate: { return expected }] as IGeneratorService
        NumberGenerator uut = new NumberGenerator(generator)
        actual = uut.generateNumber()
        Assertions.assertEquals(expected, actual)
    }

    @Test
    void checkCalculation() {
        int expected = 4
        int actual
        IGeneratorService stub = [generate: {return 2}] as IGeneratorService
        NumberGenerator uut2 = new NumberGenerator(stub)
        uut2.generateNumber()
        uut2.generateNumber()
        actual = uut2.calculateNumbers()
        Assertions.assertEquals(expected, actual)
    }
}