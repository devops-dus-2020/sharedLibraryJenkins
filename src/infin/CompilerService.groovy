package infin

import groovy.util.logging.Log

@Log
class CompilerService implements InterfaceCompilerService {
    Closure logger 
    CompilerService(Closure logger){
        this.logger = logger
    }
    void compile() {
        println "mvn compile".execute().text
    }
}
