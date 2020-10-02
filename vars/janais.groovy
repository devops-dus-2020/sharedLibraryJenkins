
import jana.devopsjana.*
import jana.dockerConnections.*

def info(message){
    IFlaeche berechner = new FlaecheService()
     Flaecheberechner uut = new Flaecheberechner(berechner)
    int flaeche = uut.FlaecheVonRechteck(1,1)

    println (flaeche)
}




/*def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}*/