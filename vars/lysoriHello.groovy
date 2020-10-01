
import lysori.helloWorldConnections.*

def helloWorld(){
    HelloWorldService service = new HelloWorldService()
    String hello = service.echoHelloWorld()

    echo hello
}

def generell(int a){
    HelloWorldService service = new HelloWorldService()
    String result = "---" + service.generellGenerator(a) + "--- ${message}"

    echo result
}