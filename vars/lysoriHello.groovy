
import lysori.helloWorldConnections.*

def helloWorld(){
    HelloWorldService service = new HelloWorldService()
    String hello = service.echoHelloWorld()

    echo hello
}

def generell(){
    HelloWorldService service = new HelloWorldService()
    String result = "Bastis Generell-Generator:\n---"
                     + service.generellGenerator(5) 
                        + "---\n"

    echo result
}