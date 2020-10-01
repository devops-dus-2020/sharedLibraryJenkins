package lysori.tests

import org.junit.jupiter.api.*
import lysori.devopsdus2020.*

class FarmTest {
    
    dataConnection stub
   
   
    Farm makeFarm()
    {
        return new Farm(stub)
    }

    @Test
    void instantiates(){
    Farm uut = makeFarm()        
   }

   @Test
    void shouldStoreAnimal(){
    String expected = "berta"
    String actual

    stub = [ storeAnimal : (String name) -> {actual = name}] as dataConnection
    
    Farm uut = makeFarm() 
    uut.Add(expected)

    Assertions.assertEquals(expected, actual)       
   }

   @Test
   void shouldCountAnimals(){
    int expected = 2
    int actual = 0

    stub = [ storeAnimal : (String name) -> {++expected}, 
            countAnimals: {expected}] as dataConnection
    
    Farm uut = makeFarm() 
    uut.Add("rosie")
    uut.Add("bob")

    actual = uut.countAnimals()

    Assertions.assertEquals(expected, actual)    
   }
}
