import de.devopsdus2020.maven.*
import de.devopsdus2020.external.*
import groovy.util.logging.*

Maven initiateMaven() {
    Closure logger = {String message -> println message}
    MavenService service = new MavenService(logger)
    Maven myMaven = new Maven(service)
    return myMaven
}

def compile() {
    Map config = [flag:" -f ", pomfile: "${WORKSPACE}"]
    Maven myMaven = initiateMaven()  

    logger(myMaven.compile(config))
}

def compile(Map config) {
    // Closure logger = {String message -> println message}
    // MavenService service = new MavenService(logger)
    // Maven myMaven = new Maven(service)
    Maven myMaven = initiateMaven()
    
    logger(myMaven.compile(config))
}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
// compile(config)
