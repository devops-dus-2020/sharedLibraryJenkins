package ray.core
import ray.core.MyInterface

class MyBusiness {

    public MyInterface mi

    MyBusiness (MyInterface mi) {
        this.mi = mi
    }

    public String invokeCall() {
        return mi.call()
    }
}