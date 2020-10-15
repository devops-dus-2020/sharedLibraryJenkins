package de.devopsdus2020.ansible

class Ansible {

    InterfaceAnsibleService service

    // Constructor
    public Ansible(InterfaceAnsibleService service) {
        this.service = service
    }

    String imagebuild(Map config) {
        service.imagebuild(config)
    }
}