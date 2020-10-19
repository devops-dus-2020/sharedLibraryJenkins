package de.devopsdus2020.external

import de.devopsdus2020.docker.*
import groovy.util.logging.Log

@Log
class DockerService implements InterfaceDockerService {
    
    Closure logger 

    DockerService (Closure logger){
        this.logger = logger
    }
    
    Integer executeDocker(Map config) {
        def convertToValueString = {it.collect { / $it.key $it.value/ } join ""}
        def csequence = "docker " + convertToValueString(config) + " "
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

    Integer dockerversion(Map config){
        //config.put(['version':''])
        return this.executeDocker([version:""])
    }

}
