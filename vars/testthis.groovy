import ray.connection.ExtServ
import ray.core.Hello
 

    def greeting(message) {
    ExtServ extserv = new ExtServ()
    Hello hello = new Hello(extserv)

    String msg = hello.shout() + "${message}"
    echo msg
    }

