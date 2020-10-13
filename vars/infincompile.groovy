import infin.*

def compile() {
    CompilerService service = new CompilerService()
    Compiler myCompiler = new Compiler(service)

    myCompiler.compile()
}
