package de.devopsdus2020.docker

class Docker {

    InterfaceDockerService service

    // Constructor
    public Docker(InterfaceDockerService service) {
        this.service = service
    }

    String dockerversion(Map config) {
        service.dockerversion(config)
    }

}
