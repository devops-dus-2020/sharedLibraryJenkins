package infin

import groovy.util.logging.Log

@Log
class CompilerService implements InterfaceCompilerService {
    
    Closure logger 

    CompilerService (Closure logger){
        this.logger = logger
    }
    
    String compile() {
        return "mvn -f /var/jenkins_home/workspace/Burning Butlers Riding on Whales/pom.xml compile".execute().text
    }

    String version(){
        return "mvn -v".execute().text
    }
}
