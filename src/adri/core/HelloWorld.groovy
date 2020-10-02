package adri.core //dieses Package muss in die Testklasse importiert werden 

import adri.connection.*

class HelloWorld {
    IHelloService service
    public HelloWorld (IHelloService Service) //Konstruktor
     {
        this.service = service
    }



}