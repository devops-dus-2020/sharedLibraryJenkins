import de.devopsdus2020.maven.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field

@Field final Map config = [f: "${WORKSPACE}"]

def makeMyMaven(){
        Closure logger = {String message -> println message}
        MavenService service = new MavenService(logger)
        Maven myMaven = new Maven(service)
        return myMaven
}

def compile() {
    makeMyMaven().compile(config)
}

def test() {  
    makeMyMaven().test(config)
}

def verify() {
    makeMyMaven().verify(config)
}

def artifactpackage() {
    makeMyMaven().artifactpackage(config)
}

def deploy() {
    makeMyMaven().deploy(config)

}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
//artifactpackage()
