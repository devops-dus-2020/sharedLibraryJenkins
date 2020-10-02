package adri

import org.junit.jupiter.api.*
import Experiment.core.*
import Experiment.connection.*


class uni_test { 
    //Uni openUni(){ 
         //return new Uni(stub)  
    // }

    @Test
    void addStudents() {
        def service = [addStudents: { "Helena" }] as IUniService
        Uni uniexample = new Uni (service)
        String helena = "Helena"
        Assertions.assertEquals ("Helena", helena)
    }

    @Test
    int countStudents(){
        //Uni uniexample2 = new Uni ()
       // Assertions.assertEquals(expected, actual)
    }
}
