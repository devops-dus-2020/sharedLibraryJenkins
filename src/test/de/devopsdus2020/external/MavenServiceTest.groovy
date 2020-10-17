package de.devopsdus2020.external

import org.junit.jupiter.api.*
import groovy.test.GroovyAssert.*

class MavenServiceTest {

    @Test
    void assembleMavenCommand_nullConfig() {
        // Mock interface
        MavenService service = new MavenService({->})
        Map config

        assert service.assembleMavenCommand(config, "") == "mvn"
        assert service.assembleMavenCommand(config, "test") == "mvn test"
    }

    @Test
    void assembleMavenCommand_nullPhase() {
        // Mock interface
        MavenService service = new MavenService({->})
 
        Map config = [mvn_args: ""]
        assert service.assembleMavenCommand(config, null) == "mvn"

        config = [mvn_args: "-f /path/to/nowhere"]
        assert service.assembleMavenCommand(config, null) == "mvn -f /path/to/nowhere"

        config = [dummy: 1, mvn_args: "-f /path/to/nowhere"]
        assert service.assembleMavenCommand(config, null) == "mvn -f /path/to/nowhere"
    }

    @Test
    void assembleMavenCommand_missingKey() {
        // Mock interface
        MavenService service = new MavenService({->})
        Map config = [dummy: 1]

        assert service.assembleMavenCommand(config, "") == "mvn"
        assert service.assembleMavenCommand(config, "test") == "mvn test"
    }

    @Test
    void assembleMavenCommand_configNotString() {
        // Mock interface
        MavenService service = new MavenService({->})
        Map config = [mvn_args: 1]

        assert service.assembleMavenCommand(config, "") == "mvn"
        assert service.assembleMavenCommand(config, "test") == "mvn test"
    }

    @Test
    void assembleMavenCommand_configEmptyString() {
        // Mock interface
        MavenService service = new MavenService({->})
        Map config = [mvn_args: ""]

        assert service.assembleMavenCommand(config, "") == "mvn"
        assert service.assembleMavenCommand(config, "test") == "mvn test"
    }

    @Test
    void assembleMavenCommand_configWithArgs() {
        // Mock interface
        MavenService service = new MavenService({->})
        Map config = [mvn_args: "-f /path/to/nowhere"]

        assert service.assembleMavenCommand(config, "") == "mvn -f /path/to/nowhere"
        assert service.assembleMavenCommand(config, "test") == "mvn -f /path/to/nowhere test"
    }

    @Test
    void assembleMavenCommand_mapWithSeveralKeys() {
        // Mock interface
        MavenService service = new MavenService({->})
        Map config = [dummy: "not related", mvn_args: "-f /path/to/nowhere"]

        assert service.assembleMavenCommand(config, "") == "mvn -f /path/to/nowhere"
        assert service.assembleMavenCommand(config, "test") == "mvn -f /path/to/nowhere test"
    }
}
