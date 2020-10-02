package Moritz.helloworldConnections  //= externe Klasse außerhalb des cores

import Moritz.moritzdevops.*

import groovy.util.logging.*

@Log
class MyHelloWorldService implements HelloWorldInterface   //6.
{

    Closure logger
    MyHelloWorldService (Closure logger){
    this.logger = logger
}

    Boolean checkEcho()
    {
        return true
    }
    
    String echoMyHelloWorld()
    {
        logger("huhhah")
        return "Hello World es grüßt Moritz"
        
    }



}
