package test

import org.junit.jupiter.api.*
import core.*
import connection.*

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
    
    @Test 
    void printSuccessFromStub() {
        def successfulStub = [compileMessage: {"Maven Compile Successful!"}] as InterfaceMavenCompile
        CoreMavenCompile cmp = new CoreMavenCompile(successfulStub)
        assert cmp.compileMessage() == "Maven Compile Successful!"
    }

    @Test
    void testIfStringContainsSubstring() {
        String rammstein = "du ... du hast ... du hast mich ... dädädä"
        Assertions.assertTrue(rammstein.contains("mich"))
    }
*/
    
    @Test
    void ifTargetFolderWillBeCreatedInMyApp() {
            ConnectionMavenCompile connect = new ConnectionMavenCompile()
            CoreMavenCompile cmp = new CoreMavenCompile(connect)
            cmp.mavenCompile()
            String lsCommand = "Test/lsCommand".execute().text
            Assertions.assertTrue(lsCommand.contains("target"))
            "Test/deleteTarget".execute().text

    }
    
    


}