import org.junit.jupiter.api.*
import rainerC.core.*

class EchoTest{

    @Test
    void assertMethod() {
    String expected = "Jeppie"
    def stub = [shout : {"Jeppie"}] as JeppieInterface
    Jeppie jo = new Jeppie(stub)
    String actual = jo.shoutJeppie()
    Assertions.assertEquals(expected, actual)
    }
}