package Moritz.tests

import org.junit.jupiter.api.*
import Moritz.core.*

class testefarm {


Farm makeFarm () //2.definiere makeFarmMethode
{
     return new Farm()
}

@Test
void intanziiere() {
     
     Farm uut = makeFarm()
     //1.Farm =Klasse uut=name davon und makeFarm= Methode. Fehler: da makeFarm nicht bekannt
}

}