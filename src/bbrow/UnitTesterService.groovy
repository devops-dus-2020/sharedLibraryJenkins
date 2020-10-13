package bbrow

import groovy.util.logging.Log

@Log
class  implements InterfaceUnitTesterService{
UnitTesterService
       
    Closure logger 

    UnitTesterService (Closure logger){
        this.logger = logger
    }
    
    String maventest(pompath) {
        return "mvn -f ${pompath} test".execute().text
    }
}