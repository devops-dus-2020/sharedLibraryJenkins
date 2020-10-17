import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*

def makeMyAnsible(){
    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    Ansible myAnsible = new Ansible(service)
    return myAnsible
}


def imagebuild(ANSIBLE_YML) { 
    Map config = [f: "${WORKSPACE}/${ANSIBLE_YML}"]
    makeMyAnsible().imagebuild(config)
}


def imagepush(ANSIBLE_YML) { 
    [:].withDefault { [] }.with { config -> config.("ansible-playbook") << "${WORKSPACE}/${ANSIBLE_YML}" ; config.("-e") << "USER=${AZURECR_USER}"
    config.("-e") << ("PASSWORD=${AZURECR_PASSWORD}") }

    makeMyAnsible().imagepush(config)
}