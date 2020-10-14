package de.devopsdus2020.maven

import org.junit.jupiter.api.*
import groovy.test.GroovyAssert.*

class MavenTest {

    @Test
    void instantiateMaven() {
        // Mock interface
        def service = [compile: () -> {}] as InterfaceMavenService
 
        Maven uut = new Maven(service)
    }
}
