
import lysori.helloWorldConnections.*

def helloWorld(message){
    HelloWorldService service = new HelloWorldService()
    String result = service.echoHelloWorld() + 
            service.generellGenerator(3) + "${message}"

    echo result
}