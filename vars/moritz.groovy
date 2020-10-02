import Moritz.moritzdevops.*
import Moritz.helloworldConnections.*
import Moritz.logs.*
import groovy.util.logging.*

def MoritzHelloWorld(){
       Closure logger = {String message -> println message}

    MyHelloWorldService service = new MyHelloWorldService(logger)
    
    logger("2: "+ service.echoMyHelloWorld())

    String helloworldstring ="Moritz: "+ service.echoMyHelloWorld()
    logger("3: "+ helloworldstring)
    logger("4: "+ helloworldstring)
    logger("5: "+ helloworldstring)


}

def main()
{
MainClass geheimeNachricht = new MainClass()
geheimeNachricht.writefile()
}




/*def beobachtung(message) {
    echo "beobachte: ${message}"
}

def warnung(message) {
    echo "warne: ${message}"
}

       stage('Beobachter M.M') {
            steps {
                sh 'echo AW ACADEMY!!!!'

                  script {
                    simple.beobachtung '(-_-)'
                    simple.warnung 'I'm watching you!'
                } 

            }
        }
*/ 