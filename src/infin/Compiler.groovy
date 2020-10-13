package infin

class Compiler {

    InterfaceCompilerService service

    // Constructor
    public Compiler(InterfaceCompilerService service) {
        this.service = service
    }

    String compile() {
        service.compile()
    }

    String version() {
        service.version()
    }
}
