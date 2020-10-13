package infin

class Compiler {

    InterfaceCompilerService service

    // Constructor
    public Compiler(InterfaceCompilerService service) {
        this.service = service
    }

    String compile(pompath) {
        service.compile(pompath)
    }

    String version() {
        service.version()
    }
}
