package lysori.helloWorldConnections

import lysori.devopsdus2020.*

class HelloWorldService implements HelloWorldInterface {

    Boolean checkSetup() {
        return true
    }

    String echoHelloWorld(){

        println "Hello Worldddd"
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