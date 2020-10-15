package de.devopsdus2020.ansible

class MyAnsible {

    InterfaceAnsibleService service

    // Constructor
    public MyAnsible(InterfaceAnsibleService service) {
        this.service = service
    }

    String imagebuild(String config) {
        service.imagebuild(config)
    }
}