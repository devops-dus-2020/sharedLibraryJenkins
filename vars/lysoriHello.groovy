
import lysori.helloWorldConnections.*

def helloWorld(){
    HelloWorldService service = new HelloWorldService()
    String hello = service.echoHelloWorld()

    echo hello
}