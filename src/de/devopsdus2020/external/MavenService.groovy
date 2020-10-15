package de.devopsdus2020.external

import de.devopsdus2020.maven.*
import groovy.util.logging.Log

@Log
class MavenService implements InterfaceMavenService {
    
    Closure logger 

    MavenService (Closure logger){
        this.logger = logger
    }
    
    String executeMaven(Map config, String phase) {
        def convertToValueString = {it.collect { / -$it.key $it.value/ } join ""}
        def csequence = "mvn " + convertToValueString(config) + " " + phase
        return csequence.execute().text
    }

    String compile(Map config) {
        return this.executeMaven(config, "clean compile")
    }

    String version(){
        return "mvn -v".execute().text
    }

    String test(Map config) {
        return this.executeMaven(config, "test")
    }

    String verify(Map config) {
        return this.executeMaven(config, "verify sonar:sonar -DskipTests -Dsonar.host.url=http://sonarqube:9000")
    }

     String artifactpackage(Map config) {
        return this.executeMaven(config, "clean package -DskipTests")
    }

    String deploy(Map config) {
        return this.executeMaven(config, "clean deploy  -DskipTests")
    }
}
