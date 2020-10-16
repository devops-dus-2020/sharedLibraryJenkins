import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field


@Field final Map config = [f: "${WORKSPACE}/${BUILDYML}"]
@Field final Map pushconfig = [f: "${WORKSPACE}/${BUILDYML}", e: "USERNAME=${USERNAME} PASSWORD=${PASSWORD}"] 

def makeMyAnsible(){
    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    Ansible myAnsible = new Ansible(service)
    return myAnsible
}

//anhang ansible-playbook xxx.yml ...
//credentialString = "-e USERNAME=${USERNAME} PASSWORD=${PASSWORD}"
def imagebuild() { 
    
    makeMyAnsible().imagebuild(config)
}

def imagepush() { 
    
    makeMyAnsible().imagebuild(pushconfig)
}
