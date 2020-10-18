package de.devopsdus2020.maven

class Maven {

    InterfaceMavenService service

    // Constructor
    public Maven(InterfaceMavenService service) {
        this.service = service
    }

    Integer compile(Map config) {
        service.compile(config)
    }

    Integer version() {
        service.version()
    }

    
    Integer test(Map config) {
        service.test(config)
    }

    Integer verify(Map config) {
        service.verify(config)
    }

    Integer artifactpackage(Map config) {
        service.artifactpackage(config)
    }

    Integer deploy(Map config) {
        service.deploy(config)
    }

    Integer tomcat(Map config) {
        service.tomcat(config)
    }
}