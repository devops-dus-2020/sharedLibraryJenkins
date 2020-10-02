import rainerC.connection.RainerExtService
import rainerC.core.Jeppie
 

    def greeting(message) {
    RainerExtService myShout = new RainerExtService()
    Jeppie ji = new Jeppie(myShout)

    String hello = ji.shoutJeppie() + "${message}"
    echo hello