package de.devopsdus2020.maven

class Maven {

    InterfaceMavenService service

    // Constructor
    public Compiler(InterfaceMavenService service) {
        this.service = service
    }

    String compile(Map config) {
        service.compile(config)
    }

    String version() {
        service.version()
    }
}
