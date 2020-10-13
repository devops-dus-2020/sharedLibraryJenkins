package infin

import groovy.util.logging.Log

@Log
class CompilerService implements InterfaceCompilerService {
    
    Closure logger 

    CompilerService (Closure logger){
        this.logger = logger
    }
    
    def compile() {
        println "mvn compile".execute().text
    }

    String version(){
        return "mvn -v".execute().text
    }
}
