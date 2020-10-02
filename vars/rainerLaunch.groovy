import rainerC.connection.RainerExtService
import rainerC.core.Jeppie
 

    def greeting(message) {
    RainerExtService myShout = new RainerExtService()
    Jeppie jo = new Jeppie(myShout)

    String hello = jo.shoutJeppie() + "${message}"
    echo hello