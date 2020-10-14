import de.devopsdus2020.maven.*
import de.devopsdus2020.external.*
import groovy.util.logging.*

// def compile() {
//     Map config = [flag:" -f ", pomfile: "${WORKSPACE}"]
//     compile(config)
// }

def compile() {
    Closure logger = {String message -> println message}
    MavenService service = new MavenService(logger)
    Maven myMaven = new Maven(service)
    Map config = [flag:" -f ", pomfile: "${WORKSPACE}"]
    
    logger(myMaven.compile(config))
}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
// compile(config)
