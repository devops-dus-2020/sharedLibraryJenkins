package lysori.helloWorldConnections

import lysori.devopsdus2020.*
import groovy.util.logging.Log

@Log
class HelloWorldService implements HelloWorldInterface {

    Boolean checkSetup() {
        return true
    }

    String echoHelloWorld(){
        String result = "Hello World"
        println result
        log.info(result)

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