import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field

@Field final Map config = [:]

def makeMyAnsible(){
    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    Ansible myAnsible = new Ansible(service)
    return myAnsible
}


def imagebuild(YML) { 
    config.f = "${WORKSPACE}/${YML}"
    makeMyAnsible().imagebuild(config)
}


def imagepush(YML) { 
    config.("ansible-playbook") = "${WORKSPACE}/${PUSHYML}"
    config.("-e") = "USER=${AZURECR_USER} -ePASSWORD=${AZURECR_PASSWORD}"
    makeMyAnsible().imagepush(config)
}