package de.devopsdus2020.ansible

class Ansible {

    InterfaceAnsibleService service

    // Constructor
    public Ansible(InterfaceAnsibleService service) {
        this.service = service
    }

    Integer imagebuild(Map config) {
        return service.imagebuild(config)
    }

    Integer imagepush(Map config){
       return service.imagepush(config)
    }

    Integer imagepull(Map config) {
        return service.imagepull(config)
    }

    Integer imagepullpush(Map config) {
        return service.imagepullpush(config)
    }
}