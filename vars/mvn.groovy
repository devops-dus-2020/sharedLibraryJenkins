import de.devopsdus2020.maven.*
import de.devopsdus2020.external.*
import groovy.util.logging.*

Maven makeMaven() { 
    Closure logger = {String message -> println message}
    MavenService service = new MavenService(logger)
    return new Maven(service)
}

def compile() {
    Maven myMaven = makeMaven()
    Map config = [flag:" -f ", pomfile: "${WORKSPACE}"]
    
    myMaven.compile(config)
}

def compile(Map config) {
    Maven myMaven = makeMaven()

    myMaven.compile(config)
}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
// compile(config)
