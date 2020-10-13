import infin.*
import groovy.util.logging.*

def compile() {
    println "pwd".execute().text
    Closure logger = {String message -> println message}
    CompilerService service = new CompilerService(logger)
    Compiler myCompiler = new Compiler(service)

    logger(myCompiler.compile())
    println "pwd".execute().text
}
