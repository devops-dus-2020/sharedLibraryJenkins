def greet(String ouput) {
    andreas.GreetingService service = new andreas.GreetingService()
    andreas.Greeting myGreeting = new andreas.Greeting(service)

    myGreeting.greet(ouput)
}
