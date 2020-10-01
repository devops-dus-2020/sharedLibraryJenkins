
import lysori.helloWorldConnections.*

def warning(message){
    HelloWorldService service = new HelloWorldService()
    String hello = service.echoHelloWorld() + " ${message}"

    echo hello
}