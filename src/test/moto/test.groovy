package moto.tests

import org.junit.jupiter.api.*
import moto.HelloWorld.*
import moto.HelloConnections.*

class MyHelloTest {

  @Test
  void checksCredentials() {
      def moto = [checkHello: { 'Hello World' }] as HelloService
      MyHello uut = new MyHello(moto)
      //String isEqual = uut.checkHello()
      //Assertions.assertEquals(isEqual)
      assert uut.checkHello() == 'Hello World'
  }

}