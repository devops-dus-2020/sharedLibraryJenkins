/*def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}*/

import sevcan.devopsdus2020.*
import sevcan.detail.*


def info() {
NumberService service = new NumberService()
NumberGenerator uut = new NumberGenerator(service)
int actual =uut.generate()
//int actual = message
//echo actual
return actual
}

println "Deine Glückszahl lautet:" + info() 
