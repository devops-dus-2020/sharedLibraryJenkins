import org.junit.jupiter.api.*
import rainerC.core.*

class EchoTest{

    @Test
    void assertMethod() {
    String expected = "Jeppie"
    def Stub = [shoutJeppie : {"Jeppie"}] as JeppieInterface
    Jeppie jo = new Jeppie(Stub)
    String actual = jo.shoutJeppie()
    Assertions.assertEquals(expected, actual)
    }
}