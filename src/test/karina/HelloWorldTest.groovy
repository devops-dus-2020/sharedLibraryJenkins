package karina.devops2020

import karina.*
import karina.helloConnections.*
import org.junit.jupiter.api.*

class HelloWorldTest {

    @Test
    void writeHelloWorld() {

    def service = [writeHelloWorld: { String name }] as HelloWorldService

    String actual = "Hello World"
   
    String expectation = "Hello World"
    HelloWorld uut = new HelloWorld()
    //Boolean isOK = hello.writeHelloWorld()
    Assertions.assertEquals (actual, expectation)
    }

}