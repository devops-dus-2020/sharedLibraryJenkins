package test

import org.junit.jupiter.api.*
import core.*

class TestMavenCompile {
    /*
    @Test
    void initialTest() {
        Assertions.assertTrue(true)
    }

    @Test
    void IsMavenVersionTheSame() {
        String mvnVersion ="test/maven_grep".execute().text
        String mvnVersionSubstring = mvnVersion.substring(0,22)
        assert mvnVersionSubstring != 'Apache Maven 1.0.0'
    }

    @Test
    void ifMavenCompileMethodIsNotNull() {
        String compileError = "test/maven_compile".execute().err.text
        assert compileError != null
    }

    @Test
    void assertSuccessFromCoreMavenCompile() {
        CoreMavenCompile cmp = new CoreMavenCompile()
        String success = cmp.compile()
        Assertions.assertEquals("Maven Compile Successful!", success)
    }
    */
    @Test 
    void printSuccessFromStub() {
        def successfulStub = [compileMessage: {"Maven Compile Successful!"}] as InterfaceMavenCompile
        CoreMavenCompile cmp = new CoreMavenCompile(successfulStub)
        assert cmp.compileMessage() == "Maven Compile Successful!"
    }

    /*
    @Test
    void ifTargetFolderWillBeCreatedInMyApp() {
        
    }
    */


}