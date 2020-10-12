package ralf

class MyVersion {
        String jar = "version"
        
        InterfaceVersion Service
    
    MyVersion(InterfaceVersion versionService) {
        
        Service = versionService
    }

    String getVersion() {
      
       return Service.GetCurrentVersion()
    }

}

