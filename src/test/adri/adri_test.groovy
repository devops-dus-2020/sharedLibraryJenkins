package adri.tests

import org.junit.jupiter.api.*
import adri.core.*
import adri.connection.*
//  achte darauf, dass der Import Pfad richtig ist!!!


class HelloWorldTest {

@Test
void gibHelloWorldAus (){
def service = [gibHelloWorldAus: { "Hello World" }] as IHelloService //geht aber auch mit --> HelloWorldService
HelloWorld adri = new HelloWorld(service)

String hello = "Hello World"
Assertions.assertEquals("Hello World", hello)  //assertEquals(Object expected, Object actual)

//Assertions.assertTrue(false)
}

}