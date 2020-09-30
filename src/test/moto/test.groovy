package moto.tests

import org.junit.jupiter.api.*
import moto.HelloWorld.*
import moto.HelloConnections.*

class MyHelloTest {

  @Test
  void checksCredentials() {
      def service = [checkHello: { 'Hello World' }] as HelloService
      MyHello uut = new MyHello(service)
      String isEqual = uut.checkHello()
      //Assertions.assertEquals(isEqual)
      assert uut.checkHello() == 'Hello World'
  }

}