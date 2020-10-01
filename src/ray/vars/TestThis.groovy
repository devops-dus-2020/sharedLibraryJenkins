    import ray.connection.ExtServ
    import ray.core.InterfaceServ
    
    ExtServ extserv = new ExtServ()

    def greeting(message) {
    
    echo (println extserv.call()) + "${message}"

    }