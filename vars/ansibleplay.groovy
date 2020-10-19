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
    Map config = [("ansible-playbook"): "${WORKSPACE}/${ANSIBLE_YML}"]
    makeMyAnsible().imagebuild(config)
}


def imagepush(ANSIBLE_YML) { 
    Map config = [:]
    config.("ansible-playbook") = "${WORKSPACE}/${ANSIBLE_YML}" 
    config.("-e") = "USER=${AZURECR_USER} -e PASSWORD=${AZURECR_PASSWORD}" 

    makeMyAnsible().imagepush(config)
}

def imagepull(ANSIBLE_YML) {
    Map config = [:]
    config.("ansible-playbook") = "${WORKSPACE}/${ANSIBLE_YML}" 
    config.("-e") = "DEST=${WORKSPACE}/target" 

    makeMyAnsible().imagepull(config)
}

def imagepullpush(ANSIBLE_YML) { 
    Map config = [:]
    config.("ansible-playbook") = "${WORKSPACE}/${ANSIBLE_YML}" 
    config.("-e") = "DEST=${WORKSPACE}/target -e USER=${AZURECR_USER} -e PASSWORD=${AZURECR_PASSWORD}" 

    makeMyAnsible().imagepullpush(config)
}

def imagedeploy(ANSIBLE_YML) { 
    this.imagebuild(ANSIBLE_YML)
}