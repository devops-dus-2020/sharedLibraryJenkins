import de.devopsdus2020.maven.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field

@Field final Map config = [f: "${WORKSPACE}"]

MyMaven makeMyMaven(){
        Closure logger = {String message -> println message}
        MavenService service = new MavenService(logger)
        return myMaven = new Maven(service)
}


def compile() {  
    logger(makeMyMaven().compile(config))
}

def test() {  
    logger(makeMyMaven().test(config))
}

def verify() {
    logger(makeMyMaven().verify(config))
}

def artifactpackage() {
    logger(makeMyMaven().artifactpackage(config))
}

def deploy() {
    logger(makeMyMaven().deploy(config))
}


// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
//artifactpackage()
