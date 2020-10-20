package de.devopsdus2020.maven

import org.junit.jupiter.api.*
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import groovy.test.GroovyAssert.*

class MavenTest {

    @Test
    void instantiateMaven() {
        // Mock interface
        def service = [() -> {}] as InterfaceMavenService

        Maven uut = new Maven(service)
    }    
}
