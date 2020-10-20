package de.devopsdus2020.external

import de.devopsdus2020.docker.*
import groovy.util.logging.Log

@Log
class DockerService implements InterfaceDockerService {
    
    Closure logger 

    DockerService (Closure logger){
        this.logger = logger
    }

    String assembleDockerCommand(Map config, String command) {
        // Build mvn command with configuration and phase

        String csequence = "docker"

        // Check whether config.mvn_args exists and is a non-empty String (or GString)
        if (config && config.containsKey('docker_opt') &&
                config.docker_opt &&
                (config.docker_opt instanceof String|| config.docker_opt instanceof GString)) {
            csequence += " " + config.docker_opt
        }
        if (command) { // non-empty string?
            csequence += " " + command
        }        
        return csequence
    }

    
    Integer executeDocker(Map config, String command) {
        String csequence = assembleDockerCommand(config, command)

        logger("cmd: ${csequence}")
        def process = csequence.execute()
        process.waitFor()
        Integer exitValue = process.exitValue()
        logger("exitValue: ${exitValue}")
        logger("err.text: ${process.err.text}")
        def buffer = process.text
        logger("text:\n${buffer}")
        return exitValue 
    }


    Integer getDockerVersion(Map config){
        //config.put([:])
        return this.executeDocker(config, "version")
    }

    Integer workWithDockerOption(Map config){
        //config.put([:])
        return this.executeDocker(config)
    }


}
