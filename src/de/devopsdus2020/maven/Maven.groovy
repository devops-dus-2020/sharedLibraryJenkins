package de.devopsdus2020.maven

class Maven {

    InterfaceMavenService service

    // Constructor
    public Maven(InterfaceMavenService service) {
        this.service = service
    }

    String compile(Map config) {
        service.compile(config)
    }

    String version() {
        service.version()
    }

    
    String test(Map config) {
        service.test(config)
    }

    String verify(Map config) {
        service.verify(config)
    }

    String artifactpackage(Map config) {
        service.artifactpackage(config)
    }

    Integer deploy(Map config, String settingsFilename) {
        File mySettings = new File(config.workspace, settingsFilename)

        if (mySettings.isFile() && mySettings.canRead()) {
            return service.deploy(config, settingsFilename)
        }
        else {
            service.looger("[ERROR] File ${mySettings.getAbsolutPath()} not found.")
            return 1
        }                            
    }

    String tomcat(Map config) {
        service.tomcat(config)
    }
}