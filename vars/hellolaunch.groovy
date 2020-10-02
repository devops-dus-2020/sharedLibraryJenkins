import indu.Connection.*
import indu.core.*

def greeting(message){
    HelloConnection hci = new HelloConnection()
    HelloClass hc = new HelloClass(hci)

    String str = hc.invokecall() + "$(message)"
    echo str 
}