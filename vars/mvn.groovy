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
    println env.NEXUS_USER.getClass()
    config.workspace = "${WORKSPACE}"
    config.nexususer = "${NEXUS_USER}"
    config.nexuspassword = "${NEXUS_PASSWORD}"
    myMaven = makeMyMaven().deploy(config)
    def returnStatus =  makeMyMaven().deploy(config)
    echo returnStatus.toString()
    return returnStatus
}

def tomcat() {
    config.workspace = "${MAVEN_GLOBAL_SETTINGS}"
    //return makeMyMaven().tomcat(config)
    sh 'mvn tomcat7:redeploy -gs ${MAVEN_GLOBAL_SETTINGS} -DskipTests'
}

// lokaler Test auskommentiert
// pompath = "./pom.xml"
// Map config = [flag:" -f ", pomfile: pompath]
//artifactpackage()