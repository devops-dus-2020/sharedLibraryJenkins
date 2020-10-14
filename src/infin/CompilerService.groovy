package infin

import groovy.util.logging.Log

@Log
class CompilerService implements InterfaceCompilerService {
    
    Closure logger 

    CompilerService (Closure logger){
        this.logger = logger
    }
    
    String compile(Map config) {
        //return "mvn -f ${pompath} clean compile".execute().text
        def convertToValueString = {it.collect { /$it.value/ } join ""}
        def csequence = "mvn compile" + convertToValueString(config)
        return csequence.execute().text
    }

    String version(){
        return "mvn -v".execute().text
    }
}
