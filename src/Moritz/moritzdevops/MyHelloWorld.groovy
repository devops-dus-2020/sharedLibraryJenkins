package Moritz.moritzdevops


class MyHelloWorld {

  HelloWorldInterface service //3.neues Objekt instanziieren, platzhalter int a; definierst klasse diese klasse hat ein helloworld interface objekt das bedeutet dass ich über dieses objekt auf alle methoden des interface zugreifen kann
  
     public MyHelloWorld (HelloWorldInterface service) 
     {
           this.service = service
     }          // 3.1.Konstruktor weist service oben ein Objekt zu
    


    Boolean checkEcho()
    {
      service.checkEcho()   //3.2 beinhaltet "rufe service check Echo auf "" //6. diese klasse soll mit klasse helloworldservice kommunizieren -> wir brauchen das interface
    }

    String echoMyHelloWorld(){

        service.echoMyHelloWorld()
    }
  
}
