import karina.devops2020.*
import karina.helloConnections.*

def info (message) {
    HelloWorldService HWS = new HelloWorldService()
    HelloWorld HW = new HelloWorld(HWS)

    String stringneu = HW.writeHelloWorld() + "${message}"
    echo stringneu
}
