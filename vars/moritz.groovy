import Moritz.moritzdevops.*
import Moritz.helloworldConnections.*
import groovy.util.logging.*

def MoritzHelloWorld(){
    MyHelloWorldService service = new MyHelloWorldService()
    String helloworldstring ="Moritz: "+ service.echoMyHelloWorld()

    Closure logger = {String message -> println message}

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