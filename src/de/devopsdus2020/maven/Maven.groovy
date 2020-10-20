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
        return ervice.version()
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

    Integer tomcat(Map config) {
       return service.tomcat(config)
    }

    String tomcat(Map config) {
        service.tomcat(config)
    }
}