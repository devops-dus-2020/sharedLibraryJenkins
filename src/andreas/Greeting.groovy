package andreas

class Greeting {

    InterfaceGreetingService service
    // Constructor
    public Greeting(InterfaceGreetingService service) {
        this.service = service
    }

    void greet(String greeting) {
        service.greet(greeting)
    }

    // void redirectEcho(String msg, Closure myecho)
    // {
    //     myecho(msg)
    // }

}