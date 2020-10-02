package Moritz.tests

import org.junit.jupiter.api.*               
import Moritz.moritzdevops.*
import Moritz.helloworldConnections.*


class MyHelloWorldTest {
@Test
void checkHelloworldVerbindung(){
     
     def service = [checkEcho: { true }] as HelloWorldInterface //8. =wir schreiben Stub -> MyHelloWorldService tut so als wäre es das Interface, damit Interface und MyHelloWorld kommunizieren können
     MyHelloWorld uut = new MyHelloWorld(service) //2. erzeuge objekt was getestet werden soll, ich weiß der service ist ein interface objekt deswegen brauche ich den stub
     Boolean check = uut.checkEcho()//4. unit under test: Methode Ausgabe gibt mir Boolean true oder false zurück, wenn er nicht true ist schlägt es fehl
     Assertions.assertTrue(check) //5.testen ob er den runner (jupiter junit5) findet und die sachen die ich fürs testen brauche auch, übergene boolean "check" von Methode checkEcho : wenn die methoden richtig ausgefüjgrt werden muss check = true ergeben
}




  @Test
  void checkString(){
    String expected = "Hello World"
    String actual=""
    def stub = [checkEcho: { true }, echoMyHelloWorld: { expected }] as HelloWorldInterface 
    MyHelloWorld uut = new MyHelloWorld(stub)
    actual = uut.echoMyHelloWorld()
    Assertions.assertEquals(expected, actual)    
     
}
}