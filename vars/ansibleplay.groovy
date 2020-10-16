import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field


@Field final Map configbuild = [f: "${WORKSPACE}/${BUILDYML}"]

//credentialString = "-e USERNAME=${USERNAME} PASSWORD=${PASSWORD}"
@Field final Map configpush = [ansible-playbook: "${WORKSPACE}/${PUSHYML}", -e: "USERNAME=${USERNAME} PASSWORD=${PASSWORD}"] 

def makeMyAnsible(){
    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    Ansible myAnsible = new Ansible(service)
    return myAnsible
}

//anhang ansible-playbook xxx.yml ...

def imagebuild() { 
    
    makeMyAnsible().imagebuild(configbuild)
}

def imagepush() { 
    
    makeMyAnsible().imagepush(configpush)
}