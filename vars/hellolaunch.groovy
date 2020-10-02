import indu.Connection.*
import indu.core.*

def greeting(message){
    HelloConnection hci = new HelloConnection()
    core.HelloClass hc = new core.HelloClass(hci)

    String str = hc.invokecall() + "${message}"
    echo str 
}
