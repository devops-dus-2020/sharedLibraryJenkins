package johannes.tests

import org.junit.jupiter.api.*
import johannes.core.*


class FarmTest {

  dataConnection stub


  Farm makeFarm()
  {
    return new Farm(stub)
  }

  @Test
  void instantiates() {
    Farm uut = makeFarm()
  }

  @Test
  void shouldStoreAnimal() {
    String expected = "berta"
    String actual
    stub = 
    [ storeAnimal : (String name) -> { actual = name } ] 
    as dataConnection
    Farm uut = makeFarm()
    uut.Add(expected)
    Assertions.assertEquals(expected, actual)
  }

  @Test
  void shouldCoundAnimals() {
    int expected = 0
    int actual = 0;
    stub = 
    [ storeAnimal : (String name) -> { ++expected },
      countAnimals : { expected }] 
    as dataConnection
    Farm uut = makeFarm()
    uut.Add("anton")
    uut.Add("melinda")
    actual = uut.GetAnimalCount()
    Assertions.assertEquals(expected, actual)
  }

}