import maik.devopsdusmaik.*
import org.junit.jupiter.api.*

class MaikEchoTest {

  @Test
  void checksTrue() {
    
      Assertions.assertTrue(true)
  }
    @Test
    void checksEcho() {
        String expected = "correct"

        def stub = [Name : {return expected}] as IEchoService
       Echo uut = new Echo(stub)
       String actual = uut.Name();
        Assertions.assertEquals(expected, actual)
    }

}
