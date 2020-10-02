package ray.test

import org.junit.jupiter.api.*
import ray.core.Hello
import ray.core.InterfaceServ

class TestHello {


  @Test
  void aMethod() {
    Assertions.assertTrue(true)    
  }

  /* 
  @Test
  void bMethod() {
    Hello hello = new Hello()
    Assertions.assertEquals("Hello", hello.shout())
  }
  */

  @Test
  void cMethod() {
    def stub = [call: {"Hello"}] as InterfaceServ
    Hello hello = new Hello(stub)
    assert hello.shout() == "Hello"
  }

}
