import rainerC.connection.RainerExtService.*
import rainerC.core.Jeppie.*
 

    def greeting(message) {
    RainerExtService myShout = new RainerExtService()
    Jeppie bla = new Jeppie(myShout)

    String hello = bla.shoutJeppie() + "${message}"
    echo hello