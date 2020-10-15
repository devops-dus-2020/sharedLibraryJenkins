import de.devopsdus2020.maven.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field

@Field final Closure logger = {String message -> println message}
@Field final MavenService service = new MavenService(logger)
@Field final Maven myMaven = new Maven(service)
@Field final Map config = [f: "${WORKSPACE}"]

def compile() {
    return myMaven.compile(config)
}

def test() {  
    return myMaven.test(config)
}

def verify() {
    return myMaven.verify(config)
}

def artifactpackage() {
    return myMaven.artifactpackage(config)
}

def deploy() {
    return myMaven.deploy(config)
}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
//artifactpackage()
