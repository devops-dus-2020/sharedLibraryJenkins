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
    myMaven.compile(config)
}

def test() {  
    myMaven.test(config)
}

def verify() {
    myMaven.verify(config)
}

def artifactpackage() {
    myMaven.artifactpackage(config)
}

def deploy() {
    myMaven.deploy(config)

}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
//artifactpackage()
