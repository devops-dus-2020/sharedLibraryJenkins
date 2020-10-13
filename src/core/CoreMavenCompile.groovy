package core
import core.InterfaceMavenCompile

class CoreMavenCompile {

    InterfaceMavenCompile imc

    CoreMavenCompile (InterfaceMavenCompile imc) {
        this.imc = imc
    }

    String compileMessage() {
        return imc.compileMessage()
    }

    void mavenCompile() {
        imc.mavenCompile()
    }
    

}