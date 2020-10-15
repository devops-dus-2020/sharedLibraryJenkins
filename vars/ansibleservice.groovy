import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field


@Field final Map config = [f: "${WORKSPACE}/${YMLPATH}"] 

//anhang ansible-playbook xxx.yml ...
//credentialString = "-e USERNAME=${USERNAME} PASSWORD=${PASSWORD}"
def imagebuild() { 
    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    Ansible myAnsible = new Ansible(service)

    logger(myAnsible.imagebuild(config))
}
