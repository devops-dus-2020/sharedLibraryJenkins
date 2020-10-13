package infin

class CompilerService implements InterfaceCompilerService {
    void compile() {
        println "mvn compile".execute().text
    }
}
