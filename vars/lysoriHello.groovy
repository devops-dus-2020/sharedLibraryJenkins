import lysori.devopsdus2020.*
import lysori.helloWorldConnections.*
import groovy.util.logging.*
//import java.util.logging.Logger

def helloWorld(){
    
    Closure logger = {String s -> println s}
    def service = new HelloWorldService(logger)
    HelloWorld h = new HelloWorld(service)
    
    logger(h.echoHelloWorld())


}

def generell(message){
    def service = new HelloWorldService()
    HelloWorld h = new HelloWorld(service)
    String result = "Bastis Generell-Generator: " + h.generellGenerator(5) + " ${message}"

    echo result
}