
import lysori.helloWorldConnections.*

def helloWorld(){
    HelloWorldService service = new HelloWorldService()
    String hello = service.echoHelloWorld()

    echo hello
}

def generell(message){
    HelloWorldService service = new HelloWorldService()
    String result = "---" + service.generellGenerator(7) + " ${message}"

    echo result
}