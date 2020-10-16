package de.devopsdus2020.external

import de.devopsdus2020.ansible.*
import groovy.util.logging.Log

@Log
class AnsibleService implements InterfaceAnsibleService {
    
    Closure logger

    AnsibleService (Closure logger){
        this.logger = logger
    }


    Integer executeAnsibleBuild(Map config) {
    def convertToValueString = {it.collect { / $it.value/ } join ""}
    def csequenceansible = "ansible-playbook" + convertToValueString(config)
    logger("cmd: ${csequenceansible}")
    def process = csequenceansible.execute()
    process.waitFor()
    Integer exitValue = process.exitValue()
    logger("exitValue: ${exitValue}")
    logger("err.text: ${process.err.text}")
    def buffer = process.text
    logger("text:\n${buffer}")
    return exitValue 
    }


    Integer imagebuild(Map config) {
        return this.executeAnsibleBuild(config)
    }
}