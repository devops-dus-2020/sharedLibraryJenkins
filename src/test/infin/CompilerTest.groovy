package infin

import org.junit.jupiter.api.*
import groovy.test.GroovyAssert.*

class GreetingTest {

    @Test
    void instantiateCompiler() {
        // Mock interface
        def service = [compile: () -> {}] as InterfaceCompilerService
 
        Compiler uut = new Compiler(service)
    }
}
