import lysori.devopsdus2020.*
import lysori.helloWorldConnections.*

def helloWorld(){
    def service = new HelloWorldService()
    HelloWorld h = new HelloWorld(service)
    String hello = h.echoHelloWorld()

    echo hello
}

def generell(message){
    def service = new HelloWorldService()
    HelloWorld h = new HelloWorld(service)
    String result = "Bastis Generell-Generator: " + h.generellGenerator(5) + " ${message}"

    echo result
}