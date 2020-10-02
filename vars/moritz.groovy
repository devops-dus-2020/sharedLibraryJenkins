import Moritz.moritzdevops.*
import Moritz.helloworldConnections.*
import groovy.util.logging.*

def MoritzHelloWorld(){
       Closure logger = {String message -> println message}

    MyHelloWorldService service = new MyHelloWorldService(logger)
    logger(helloworldstring)
    logger(helloworldstring)
    String helloworldstring ="Moritz: "+ service.echoMyHelloWorld()

    logger(helloworldstring)
    logger(helloworldstring)
    logger(helloworldstring)
    logger(helloworldstring)


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