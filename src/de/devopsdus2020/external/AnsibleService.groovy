package de.devopsdus2020.external

import de.devopsdus2020.ansible.*
import groovy.util.logging.Log

@Log
class AnsibleService implements InterfaceAnsibleService {
    
    Closure logger

    AnsibleService (Closure logger){
        this.logger = logger
    }


    String executeAnsibleBuild(Map config) {
    def convertToValueString = {it.collect { / -$it.key $it.value/ } join ""}
    def csequenceansible = "ansible-playbook " + convertToValueString(config)
    logger("cmd: ${csequence}")
    return csequenceansible.execute().text
    }


    String imagebuild(Map config) {
        return this.executeAnsibleBuild(config)
    }
}