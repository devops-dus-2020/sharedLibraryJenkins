import adri.connection.*
import adri.core.*


//def info(nanananana) {
 //   echo "INFO: ${nanananana}"
//}

//def warning(warum) {
//    echo "WARNING: ${warum}"

def service (message) { //def service (message= "Adriana") { --> brauche ich auch, um was in der Konsole anzeigen zu lassen
    HelloWorldService adri = new HelloWorldService()

    String hello = adri.gibHelloWorldAus() + "${message}"
    println(hello)
    // println hello
    }


//service () // das nur, um irgendetwas auszugeben --> muss auskommentiert werden, um es dann in der Pipeline auszuführen