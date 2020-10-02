package andreas

class Greeting {

    InterfaceGreetingService service

    // Constructor
    public Greeting(InterfaceGreetingService service) {
        println "In Greeting constructor"
        this.service = service
    }

    void greet(String greeting) {
        println 'In Greeting.greet()'
        service.greet(greeting)
    }

    void redirectEcho(String msg, Closure myecho)
    {
        myecho(msg)
    }

}