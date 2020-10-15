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

    String executeAnsibleBuild(config) {
        def csequenceansible = "ansible-playbook " + ${config}
        return csequenceansible.execute().text
    }


    String buildImage(config) {
        return this.executeAnsibleBuild(config)
    }

}
