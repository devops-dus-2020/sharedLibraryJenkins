package lysori.helloWorldConnections

import lysori.devopsdus2020.*
import groovy.util.logging.Log

@Log
class HelloWorldService implements HelloWorldInterface {
    
    Closure logger
    
    public HelloWorldService (Closure logger){
         this.logger = logger
    }

    Boolean checkSetup() {
        return true
    }

    String echoHelloWorld(){
        
        logger("Ninja")
        return "Hello World"
    }

    String generellGenerator(int a){
        String result = "" 
        
        for(int i = 0; i < a; ++i){
            result += "generell"
        }

        return result
    }
}