import de.devopsdus2020.ansible.*
//import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field


@Field final Map config = [f: "${WORKSPACE}/${path}"] 


//Factory pattern
MyAnsible makeMyAnsible(){
        Closure logger = {String message -> println message}
        AnsibleService service = new AnsibleService(logger)
        return myAnsible = new Ansible(service)
}


//anhang ansible-playbook xxx.yml ...
//credentialString = "-e USERNAME=${USERNAME} PASSWORD=${PASSWORD}"
def imagebuild() { 
    logger(makeMyAnsible().imagebuild(config))
}

def imagepush(credentialString) {  
    logger(makeMyAnsible().imagepush(config, credentialString))
}