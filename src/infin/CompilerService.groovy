package infin

import groovy.util.logging.logging

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
