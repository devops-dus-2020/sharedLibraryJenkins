package de.devopsdus2020.maven

import org.junit.jupiter.api.*
import org.junit.*
import org.junit.rules.TemporaryFolder
import groovy.test.GroovyAssert.*

class MavenTest {

    Map config
    String filename = "settings.xml"

    @BeforeAll
    static void initialize() {
        @TempDir
        static Path tempFolder;
        final File tempFile = tempFolder.newFile(filename);
        config.workspace = tempFolder.getRoot()
    }

    @Test
    void instantiateMaven() {
        // Mock interface
        println config.workspace
        def service = [() -> {}] as InterfaceMavenService
        Maven uut = new Maven(service)
    }    

    // @Test
    // void checkDeployPassesFilename() {
    //     // Mock interface
    //     def service = [deploy: (Map, String actual) -> {expected = actual}] as InterfaceMavenService

    //     Maven uut = new Maven(service)
    //     uut.deploy(config, filename)
    //     assert expected == actual
    // }

    // @Test
    // void checkDeployUnkownFilename() {
    //     Map config
    //     String filename = "FilenameDoesNotExist"

    //     // Mock interface
    //     def service = [deploy: (Map, String) -> {2}] as InterfaceMavenService

    //     Maven uut = new Maven(service)
    //     assert 1 == service.deploy(config, filename)
    // }

    // @Test
    // void checkDeployDoesNotAcceptEmptyFilename() {
    //     String expected = "[ERROR] File ${config.workspace} not found."

    //     // Mock interface
    //     def service = [deploy: (Map, String) -> {1}, 
    //                    logger: (String msg) -> {actual}] as InterfaceMavenService

    //     Maven uut = new Maven(service)
    //     assert 1 == service.deploy(config, "")
    //     assert expected == actual
    // }

    // @Test
    // void checkDeploySuccessful() {
    //     // Mock interface
    //     def service = [deploy: (Map, String) -> {0}] as InterfaceMavenService

    //     Maven uut = new Maven(service)
    //     assert 0 == service.deploy(config, filename)
    // }
}
