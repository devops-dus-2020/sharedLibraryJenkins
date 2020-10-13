package infin

class Compiler {

    InterfaceCompilerService service

    // Constructor
    public Compiler(InterfaceCompilerService service) {
        this.service = service
    }

    void compile() {
        service.compile()
    }
}
