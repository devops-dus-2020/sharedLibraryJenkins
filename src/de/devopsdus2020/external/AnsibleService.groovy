package de.devopsdus2020.external

import de.devopsdus2020.ansible.*
import groovy.util.logging.Log

@Log
class AnsibleService implements InterfaceAnsibleService {
    
    Closure logger

    AnsibleService (Closure logger){
        this.logger = logger
    }
    

    //InputStream  configFile = streamFileFromWorkspace('data/config.yml')

    String buildImage(String config) {
        return "ansible-playbook + ${config}".execute().text
    }

}
