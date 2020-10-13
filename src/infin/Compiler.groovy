package infin

class Compiler {

    InterfaceCompilerService service

    // Constructor
    public Compiler(InterfaceCompilerService service) {
        this.service = service
    }

    String compile(Map config) {
        service.compile(config)
    }

    String version() {
        service.version()
    }
}
