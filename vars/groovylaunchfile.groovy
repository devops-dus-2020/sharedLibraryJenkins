import ray.connection.MyExtService
import ray.core.MyBusiness
 

    def greeting(message) {
    MyExtService myEx = new MyExtService()
    MyBusiness mb = new MyBusiness(myEx)

    String hello = MyBusiness.invokeCall() + "${message}"
    echo hello
    // println hello
    }

