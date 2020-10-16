import de.devopsdus2020.maven.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field

@Field final Map config = [mvn_args: "-f ${WORKSPACE}"]

def makeMyMaven(){
    Closure logger = {String message -> println message}
    MavenService service = new MavenService(logger)
    Maven myMaven = new Maven(service)
    return myMaven
}

def version() {
    return makeMyMaven().version()
}

def compile() {
    return makeMyMaven().compile(config)
}

def test() {  
    return makeMyMaven().test(config)
}

def verify() {
    return makeMyMaven().verify(config)
}

def artifactpackage() {
    return makeMyMaven().artifactpackage(config)
}

def deploy() {
    config.nexususer = NEXUS_USER
    config.nexuspassword = NEXUS_PASSWORD
    config.mvn_args += " -s NexusSettings.xml"
    return makeMyMaven().deploy(config)
}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
//artifactpackage()
