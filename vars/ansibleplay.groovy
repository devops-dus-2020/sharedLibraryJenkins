import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*

def makeMyAnsible(){
    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    Ansible myAnsible = new Ansible(service)
    return myAnsible
}


def imagebuild(YML) { 
    Map config = [f: "${WORKSPACE}/${YML}"]
    makeMyAnsible().imagebuild(config)
}


def imagepush(YML) { 
    Map config = [("ansible-playbook"): "${WORKSPACE}/${PUSHYML}"]
    config.("-e") = "USER=${AZURECR_USER} -e PASSWORD=${AZURECR_PASSWORD}"
    makeMyAnsible().imagepush(config)
}