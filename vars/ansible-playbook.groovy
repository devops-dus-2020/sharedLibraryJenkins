import de.devopsdus2020.ansible.*
//import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field

@Field final Closure logger = {String message -> println message}
@Field final AnsibleService service = new AnsibleService(logger)
@Field final Ansible myAnsible = new Ansible(service)
@Field final Map config = [f: "${WORKSPACE}/${path}"] 

//anhang ansible-playbook xxx.yml ...
//credentialString = "-e USERNAME=${USERNAME} PASSWORD=${PASSWORD}"
def imagebuild() { 
    logger(myAnsible.imagebuild(config))
}

def imagepush(credentialString) {  
    logger(myAnsible.imagepush(config, credentialString))
}