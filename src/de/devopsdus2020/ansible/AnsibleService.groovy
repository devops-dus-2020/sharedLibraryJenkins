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

    String executeAnsiblePush(Map config, String credentials) {
        def convertToValueString = {it.collect { / -$it.key $it.value/ } join ""}
        def csequenceansible = "ansible-playbook " + convertToValueString(config) + credentials
        return csequenceansible.execute().text
    }

      String executeAnsibleBuild(Map config) {
        def convertToValueString = {it.collect { / -$it.key $it.value/ } join ""}
        def csequenceansible = "ansible-playbook " + convertToValueString(config)
        return csequenceansible.execute().text
    }


    String imagebuild(Map config) {
        return this.executeAnsibleBuild(config)
    }

    String imagepush(Map config, String credentials){
        return this.executeAnsiblePush(config, credentials)
    }

}
