package andreas

class Greeting {

    InterfaceGreetingService service
    public Greeting(InterfaceGreetingService service) {
        this.service = service
    }

    void greet(String greeting) {
        service.greet(greeting)
    }
}