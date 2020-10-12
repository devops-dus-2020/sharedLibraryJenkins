import org.junit.jupiter.api.*
import ralf.*

class GroovyTest {
  
  @Test
  void checkVersionFake1() {
    String string1 ="version1"
    Assertions.assertEquals("version1", string1)
  }  

  @Test
  void checkVersionFake2() {
    MyVersion jarVersion = new MyVersion()
    Assertions.assertEquals("version", jarVersion.jar)
  }  

  @Test
  void checkVersion() {
	def service = [checkVersion: { true }] as GroovyTest
  }  

  @Test
  void getVersionFromMethod() {
   MyVersion uut = new MyVersion(new VersionService())
   Assertions.assertEquals("version", uut.getVersion())
  }
 @Test
  void getVersionFromStub() {
   InterfaceVersion stub = [GetCurrentVersion:{return "version"}] as InterfaceVersion
   MyVersion uut = new MyVersion(stub)
   Assertions.assertEquals("version", uut.getVersion())
  }
  /*  

  
@Test
  void checkVersionFake3() {
    String expected = "version"
    String actual = jar.MyVersion
    Assertions.assertEquals(expected, actual)
  }  

  @Test
  void checkFile() {
		int a = 1
  }
  
    @Test
  void checkBuild() {
		int a = 1
  }
*/  
}
