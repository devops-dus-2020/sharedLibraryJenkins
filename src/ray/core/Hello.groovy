package ray.core
import ray.core.InterfaceServ

class Hello {

    public InterfaceServ interf

    Hello (InterfaceServ interf) {
        this.interf = interf
    }

    public String shout() {
        return interf.call()
    }
}