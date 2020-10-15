import de.devopsdus2020.ansible.*
import de.devopsdus2020.external.*
import groovy.util.logging.*
import groovy.transform.Field





//anhang ansible-playbook xxx.yml ...
//credentialString = "-e USERNAME=${USERNAME} PASSWORD=${PASSWORD}"
def buildImage() { 
    Closure logger = {String message -> println message}
    AnsibleService service = new AnsibleService(logger)
    MyAnsible myAnsible = new MyAnsible(service)
    
    myAnsible.buildImage("/var/jenkins_home/workspace/BBROW_Multi_master/buildImage.yml")
}