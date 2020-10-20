package de.devopsdus2020.docker

class Docker {

    InterfaceDockerService service

    // Constructor
    public Docker(InterfaceDockerService service) {
        this.service = service
    }

    String getDockerVersion(Map config) {
        service.getDockerVersion(config)
    }

    String workWithDockerOption(Map config) {
        service.workWithDockerOption(config)
    }

}
