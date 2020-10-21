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
    Integer exitcode = makeMyMaven().compile(config)
    if (exitcode != 0) {
        error "Compile step failed! Exit code: ${exitcode}"
    }
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
    config.settings = "${MAVEN_GLOBAL_SETTINGS}"
    return makeMyMaven().deploy(config)
}

def deploy(String settingsFilename) {
    config.workspace = "${WORKSPACE}"
    config.nexususer = "${NEXUS_USER}"
    config.nexuspassword = "${NEXUS_PASSWORD}"

    // A settings.xml wit the name settingsFilename must be provided by SCM in workspace folder
    Integer exitcode = makeMyMaven().deploy(config, settingsFilename)
    if (exitcode != 0) {
        error "Deploy to Nexus failed! Exit code: ${exitcode}"
    }

}

def tomcat() {
    config.settings = "${MAVEN_GLOBAL_SETTINGS}"
    //return makeMyMaven().tomcat(config)
    sh 'mvn tomcat7:redeploy -gs ${MAVEN_GLOBAL_SETTINGS} -DskipTests'

}
