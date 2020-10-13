import infin.*
import groovy.util.logging.*

def compile(Map config) {
    Closure logger = {String message -> println message}
    CompilerService service = new CompilerService(logger)
    Compiler myCompiler = new Compiler(service)

    logger(myCompiler.compile(config))
}

//pompath bitte an deinen Jenkinsfile anpassen
//pompath = "./pom.xml"
//Map config = [flag:" -f ", pomfile: pompath]
//compile(config)
