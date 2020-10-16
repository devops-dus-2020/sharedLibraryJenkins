package de.devopsdus2020.ansible

class Ansible {

    InterfaceAnsibleService service

    // Constructor
    public Ansible(InterfaceAnsibleService service) {
        this.service = service
    }

    Integer imagebuild(Map config) {
        service.imagebuild(configbuild)
    }

    Integer imagepush(Map configpush){
        service.imagepush(configpush)
    }
}