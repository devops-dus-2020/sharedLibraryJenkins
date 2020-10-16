package de.devopsdus2020.external

import de.devopsdus2020.ansible.*
import groovy.util.logging.Log

@Log
class AnsibleService implements InterfaceAnsibleService {
    
    Closure logger

    public AnsibleService (Closure logger){
        this.logger = logger
    }

    Integer executeAnsibleBuild(Map configbuild) {
    def convertToValueString = {it.collect { / $it.value/ } join ""}
    def csequenceansible = "ansible-playbook" + convertToValueString(configbuild)
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


    Integer executeAnsiblePush(Map configpush) {
    
    //TODO: ersetzen convertToValueString -> siehe map configpush
    def convertToValueString = {it.collect { / $it.value/ } join ""}

    //Map configpush = [f: "${WORKSPACE}/${PUSHYML}", e: "USERNAME=${USERNAME} PASSWORD=${PASSWORD}"] 
    def csequenceansible = "ansible-playbook" + //value: "${WORKSPACE}/${PUSHYML}" + key + value: "USERNAME=${USERNAME} PASSWORD=${PASSWORD}"
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
    
    Integer imagebuild(Map configbuild) {
        return this.executeAnsibleBuild(configbuild)
    }

     Integer imagepush(Map configpush) {
        return this.executeAnsiblePusch(configpush)
    }
}
