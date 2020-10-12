package ray.test

import org.junit.jupiter.api.*
import ray.core.MyBusiness
import ray.core.MyInterface

class MyTestFixture {

  /*  first two tests, deprecated because names changed
  @Test
  void aMethod() {
    Assertions.assertTrue(true)    
  }


  @Test
  void bMethod() {
    Hello hello = new Hello()
    Assertions.assertEquals("Hello", hello.shout())
  }
  */

  @Test
  void cMethod() {
    def stub = [call: {"Hello"}] as MyInterface
    MyBusiness mb = new MyBusiness(stub)
    assert mb.invokeCall() == "Hello"
  }

}
