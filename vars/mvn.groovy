import de.devopsdus2020.maven.*
import de.devopsdus2020.external.*
import groovy.util.logging.*

// def compile() {
//     Map config = [flag:" -f ", pomfile: "${WORKSPACE}"]
//     compile(config)
// }

def compile() {
    Maven myMaven = mvn.makeMaven()
    Map config = [flag:" -f ", pomfile: "${WORKSPACE}"]
    
    logger(myMaven.compile(config))
}
Maven makeMaven() { 
    Closure logger = {String message -> println message}
    MavenService service = new MavenService(logger)
    return new Maven(service)

}


def compile(Map config) {
    mvn.makeMaven()
    logger(myMaven.compile(config))
}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
// compile(config)
