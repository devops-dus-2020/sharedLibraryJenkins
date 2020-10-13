package connection
import core.*

class ConnectionMavenCompile implements InterfaceMavenCompile {

    String compileMessage() {
        return "Maven Compile Successful!"
    }

    void mavenCompile() {
        "test/maven_compile".execute().text
    }
}

