import ray.connection.ExtServ
    

    ExtServ extserv = new ExtServ()

    def greeting(message) {
    
    echo (println extserv.call()) + "${message}"
    }
