import ray.connection.MyExtService
import ray.core.MyBusiness
 
    //String doedel = "Du Dödel"

    def greeting(message) {
    MyExtService myEx = new MyExtService()
    MyBusiness mb = new MyBusiness(myEx)

    String hello = mb.invokeCall() + "${message}"
    echo hello
    // return hello
    // println hello
    }

    
    // println greeting()
    // println doedel

