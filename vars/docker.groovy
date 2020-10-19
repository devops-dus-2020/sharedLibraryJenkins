import de.devopsdus2020.docker.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field


@Field final Map config = [version: ""] 


def makeMyDocker(){
    Closure logger = {String message -> println message}
    DockerService service = new DockerService(logger)
    Docker myDocker = new Docker(service)
    return myDocker
}

def dockerversion() {  
    makeMyDocker().dockerversion(config)
}

dockerversion()