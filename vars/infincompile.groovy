import infin.*
import groovy.util.logging.*

def compile() {
    Closure logger = {String message -> println message}
    CompilerService service = new CompilerService(logger)
    Compiler myCompiler = new Compiler(service)

    logger(myCompiler.version())
    //println "mvn -v".execute().text
}
