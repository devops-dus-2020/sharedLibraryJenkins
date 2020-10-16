import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field


@Field final Map configbuild = [f: "${WORKSPACE}/${BUILDYML}"]

//credentialString = "-e USERNAME=${USERNAME} PASSWORD=${PASSWORD}"
@Field final String configpush = "ansible-playbook /var/jenkins_home/workspace/BBROW_Multi_master/loginPush.yml -e USER=devopsdus2020 PASSWORD=ext/cj5v9Q8maQdxY1yngPgB57l4Eja2"


def makeMyAnsible(){

    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    Ansible myAnsible = new Ansible(service)
    return myAnsible
}


def imagebuild() { 
    
    makeMyAnsible().imagebuild(configbuild)
}


def imagepush() { 
    
    makeMyAnsible().imagepush(configpush)
}