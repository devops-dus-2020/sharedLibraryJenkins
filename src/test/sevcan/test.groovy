package sevcan.tests
import sevcan.devopsdus2020.*

import org.junit.jupiter.api.*
import static groovy.test.GroovyAssert.shouldFail
import sevcan.detail.*


class SevcansNumberTest {
IDataConnection stub

  @Test
  void GenerateNumber() {
      NumberGenerator uut = new NumberGenerator()
  }

  @Test
  void testNumbers() {
    int expected = 9
    stub = [generate : {return expected}] as IDataConnection
    NumberGenerator uut = new NumberGenerator(stub)
    int actual = uut.generate()
    Assertions.assertEquals(expected, actual)
    }
}