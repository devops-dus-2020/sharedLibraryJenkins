import ray.connection.ExtServ

 

    def greeting(message) {
    ExtServ extserv = new ExtServ()
    String msg = extserv.call() + "${message}"
    echo msg
    }

