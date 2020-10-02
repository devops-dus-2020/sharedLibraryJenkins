import jana.devopsjana.*
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import jana.dockerConnections.*


class FlaecheBerechnerTest {

  @Test
  public void a1b1_Flaeche () {
    def stub = [FlaecheVonRechteck : (int a, int b) -> {return a*b}] as IFlaeche
    Flaecheberechner uut = new Flaecheberechner(stub)
    int flaeche = uut.FlaecheVonRechteck(1,1)
    assertEquals (1,flaeche)
  }
  @Test
  public void a3b5_Flaeche()  {
    def stub = [FlaecheVonRechteck : (int a, int b) -> {return a*b}] as IFlaeche
    Flaecheberechner uut = new Flaecheberechner(stub)
    int flaeche = uut.FlaecheVonRechteck(3,5)
    assertEquals (15,flaeche)
  }
}


