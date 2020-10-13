package infin

interface InterfaceCompilerService extends Serializable {
    String compile(Map config)
    String version()
}
