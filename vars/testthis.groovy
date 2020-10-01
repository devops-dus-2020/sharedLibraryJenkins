import ray.connection.ExtServ

 

    def greeting(message) {
    ExtServ extserv = new ExtServ()
    echo (println extserv.call() + "${message}")

    }

