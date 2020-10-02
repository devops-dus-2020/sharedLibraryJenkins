//TODO import statements
import maik.devopsdusmaik.*
import maik.core.*
import java.util.logging.Logger


def warning() {
    def s = new EchoService()
    Echo uut = new Echo(s)
    Logger logger = Logger.getLogger()
    logger.info (uut.Name())
    
     
}