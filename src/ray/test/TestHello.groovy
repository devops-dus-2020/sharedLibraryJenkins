package ray.test

import org.junit.jupiter.api.*
import ray.test.Hello

class TestHello {

  @Test
  void aMethod() {
    def stub = [shout: {"Hello"}] as InterfaceServ
    Hello hello = new Hello()
    Assertions.assertEquals("Hello", hello.shout())
    // Assertions.assertEquals("Hello", stub.shout)
  }
}
