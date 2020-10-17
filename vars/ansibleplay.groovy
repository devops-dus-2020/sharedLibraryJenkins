import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*



def makeMyAnsible(){
    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    Ansible myAnsible = new Ansible(service)
    return myAnsible
}


def imagebuild() { 
    Map configbuild = [f: "${WORKSPACE}/${BUILDYML}"]
    makeMyAnsible().imagebuild(configbuild)
}


def imagepush() { 
    Map configpush = [("ansible-playbook"): "${WORKSPACE}/${PUSHYML}", ("-e"): "USER=${AZURECR_USERNAME} -ePASSWORD=${AZURECR_PASSWORD}"]
    makeMyAnsible().imagepush(configpush)
}