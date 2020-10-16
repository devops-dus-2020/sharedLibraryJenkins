package de.devopsdus2020.external

import de.devopsdus2020.maven.*
import groovy.util.logging.Log

@Log
class MavenService implements InterfaceMavenService {
    
    Closure logger 

    MavenService (Closure logger){
        this.logger = logger
    }
    
    String assembleMavenCommand(Map config, String phase) {
        String csequence = "mvn"
        logger("In assembleMavenCommand: ${config.mvn_args}, ${phase}")
        if (config)
            logger("config true")
        if (config.containsKey('mvn_args'))
            logger("containsKey true")        
        if (config.mvn_args)
            logger("config.mvn_args true")        
        if (config.mvn_args instanceof String)
            logger("config.mvn_args instanceof String true")        
        if (config && config.containsKey('mvn_args') &&
                config.mvn_args && config.mvn_args instanceof String) {
            csequence += " " + config.mvn_args
        }
        if (phase) { // non-empty string
            csequence += " " + phase
        }
        
        return csequence
    }

    Integer executeMaven(Map config, String phase) {
        logger("${config.mvn_args}, ${phase}")
        String csequence = assembleMavenCommand(config, phase)
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

    Integer version(){
        Map config = [mvn_args: "-v"]
        return this.executeMaven(config, "")
    }

    Integer compile(Map config) {
        return this.executeMaven(config, "compile")
    }

    Integer test(Map config) {
        return this.executeMaven(config, "test")
    }

    Integer verify(Map config) {
        return this.executeMaven(config, "verify sonar:sonar -DskipTests -Dsonar.host.url=http://sonarqube:9000")
    }

    Integer artifactpackage(Map config) {
        return this.executeMaven(config, "clean package -DskipTests")
    }

    Integer deploy(Map config) {
        return this.executeMaven(config, "clean deploy --settings=${WORKSPACE}/settings.xml -DskipTests")
    }
}
