package Moritz.helloworldConnections  //= externe Klasse außerhalb des cores

import Moritz.moritzdevops.*

import groovy.util.logging.Log

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
        
        return "Hello World sagt: SCHWEIG!"
        
    }



}
