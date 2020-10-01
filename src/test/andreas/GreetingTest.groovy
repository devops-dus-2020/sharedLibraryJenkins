package andreas

import org.junit.jupiter.api.*
import groovy.test.GroovyAssert.*

class GreetingTest {

    @Test
    void instantiateGreeting() {
        // Mock interface
        def service = [greet: (String) -> { }] as InterfaceGreetingService
 
        Greeting uut = new Greeting(service)
    }

    @Test
    void checkGreetingIsPassed() {
        String actual = 'High five!'
        String expected
     
        // Mock interface
        def service = [greet: {String greeting -> {expected = greeting}}] as InterfaceGreetingService
 
        Greeting uut = new Greeting(service)
        uut.greet(actual)

        assert expected == actual
    }

    @Test
    void checkNullPointerException() {
        String actual = null
     
        // Mock interface
        def service = [greet: {String greeting -> { throw new NullPointerException()}}] as InterfaceGreetingService
 
        Greeting uut = new Greeting(service)
        GroovyAssert.shouldFail (NullPointerException) { uut.greet(actual) }

    }
}

