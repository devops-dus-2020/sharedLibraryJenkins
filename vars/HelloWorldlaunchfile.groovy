import julia.Connection
import julia.core.*


def greeting(message) {
    HelloWorldConnection HWC = new HelloWorldConnection
    HelloWorldClass HC = new HelloWorldClass(HWC)

    String stringneu = HC.invokeCall() + "${message}"
    echo stringneu
}