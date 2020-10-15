package de.devopsdus2020.external

import de.devopsdus2020.ansible.*
import groovy.util.logging.Log

@Log
class AnsibleService implements InterfaceAnsibleService {
    
    Closure loggeransible 

    AnsibleService (Closure loggeransible){
        this.loggeransible = loggeransible
    }
    

    //InputStream  configFile = streamFileFromWorkspace('data/config.yml')

    String executeAnsible(Map config, String phase) {
        def convertToValueString = {it.collect { / -$it.key $it.value/ } join ""}
        def csequenceansible = "ansible-playbook " + convertToValueString(config) + " " + configFile
        return csequenceansible.execute().text
    }

    


    String imagebuild(Map config) {
        return this.executeAnsible(config,)
    }

    String imagepush(Map config){
        return this.executeAnsible(config)
    }

}
