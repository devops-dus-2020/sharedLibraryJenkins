import andreas.*

def greet(String ouput) {
    GreetingService service = new GreetingService()
    Greeting myGreeting = new Greeting(service)

    myGreeting.greet(ouput)
}
