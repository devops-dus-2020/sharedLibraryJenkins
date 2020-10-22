package de.devopsdus2020.maven

class Maven {

    InterfaceMavenService service

    // Constructor
    public Maven(InterfaceMavenService service) {
        this.service = service
    }

    Integer compile(Map config) {
        return service.compile(config)
    }

    Integer version() {
        return service.version()
    }

    
    Integer test(Map config) {
        return service.test(config)
    }

    Integer verify(Map config) {
        return service.verify(config)
    }

    Integer artifactpackage(Map config) {
        return service.artifactpackage(config)
    }

    Integer deploy(Map config) {
        return service.deploy(config)
    }

    Integer deploy(Map config, String settingsFilename) {
        if (settingsFilename.isEmpty() || settingsFilename == null) {
            service.printToLogger("[ERROR] No filename given.")
            return 1
        }

        File mySettings = new File(config.workspace, settingsFilename)
        if (mySettings.isFile() && mySettings.canRead()) {
            return service.deploy(config, settingsFilename)
        }
        else {
            service.printToLogger("[ERROR] File ${mySettings.getAbsolutePath()} not found.".toString())
            return 2
        }        
    }
                                    
    Integer tomcat(Map config) {
        return service.tomcat(config)
    }
}