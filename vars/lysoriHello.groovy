
import lysori.helloWorldConnections.*

def helloWorld(){
    HelloWorldService service = new HelloWorldService()
    String hello = service.echoHelloWorld()

    echo hello
}

def generell(message){
    HelloWorldService service = new HelloWorldService()
    String result = "Bastis Generell-Generator: " + service.generellGenerator(5) + " ${message}"

    echo result
}