//TODO import statements
import maik.devopsdusmaik.*
import maik.core.*
import groovy.util.logging.Log

@Log
def warning() {
    def s = new EchoService()
    Echo uut = new Echo(s)
    log.info(uut.Name()) 
}