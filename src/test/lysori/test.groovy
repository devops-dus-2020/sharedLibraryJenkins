
package lysori.tests


import org.junit.jupiter.api.*
import lysori.devopsdus2020.*
import lysori.helloWorldConnections.*


class HelloWorldTest {
  @Test
  void checkHelloWorldSetup() {
     
     def service = [checkSetup: { true }] as HelloWorldInterface
     HelloWorld uut = new HelloWorld(service)
     Boolean check = uut.checkSetup()

     Assertions.assertTrue(check)
  }

  @Test
  void checkString(){
    String expected = "Hello World"
    String actual
    def service = [checkSetup: { true }, echoHelloWorld: { expected }] as HelloWorldInterface 
    HelloWorld uut = new HelloWorld(service)
    actual = uut.echoHelloWorld()

    
    Assertions.assertEquals(expected, actual)    
  }

  @Test
  void checkGenerellGenerator(){
    int i = 2
    String expected ="generellgenerell"
    String actual
    def service = [checkSetup: { true }, 
           echoHelloWorld: { expected }, 
           generellGenerator: (int a) -> {expected}] as HelloWorldInterface 
    HelloWorld uut = new HelloWorld(service)
    actual = uut.generellGenerator(i)

    
    Assertions.assertEquals(expected, actual)    
  }

}


