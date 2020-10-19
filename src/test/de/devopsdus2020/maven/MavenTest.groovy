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

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    void checkDeployPassesFilename() {
        Map config
        String filename = "settings.xml"

        // Mock interface
        def service = [deploy: (String actual) -> {expected = actual}] as InterfaceMavenService

        Maven uut = new Maven(service)
        assert expected == actual
    }

    @Test
    void checkDeployUnkownFilename() {
        Map config
        String filename = "FilenameDoesNotExist"

        // Mock interface
        def service = [deploy: (Map, String) -> {2}] as InterfaceMavenService

        Maven uut = new Maven(service)
        assert 1 == service.deploy(config, filename)
    }

    @Test
    void checkDeployDoesNotAcceptEmptyFilename() {
        Map config = [workspace: tempFolder.root()]
        String expected = "[ERROR] File ${config.workspace} not found."

        // Mock interface
        def service = [deploy: (Map, String) -> {1}, 
                       logger: (String msg) -> {actual}] as InterfaceMavenService

        Maven uut = new Maven(service)
        assert 1 == service.deploy(config, "")
        assert expected == actual
    }

    @Test
    void checkDeploySuccessful() {
        Map config = [workspace: tempFolder.root()]
        String actual = "settings.xml"
        final File tempFile = tempFolder.newFile(actual);

        // Mock interface
        def service = [deploy: (Map, String) -> {1}] as InterfaceMavenService

        Maven uut = new Maven(service)
        assert service.deploy(actual) == 0
    }
}
