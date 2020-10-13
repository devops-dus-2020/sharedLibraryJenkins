package infin

class CompilerService implements InterfaceCompilerService {
    void compile() {
        "mvn compile > maven.output".execute()
    }
}