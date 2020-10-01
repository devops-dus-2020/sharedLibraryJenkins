import andreas.*

def greet(String ouput) {
    println "In vars/greeting.greet"
    
    GreetingService service = new GreetingService()
    Greeting myGreeting = new Greeting(service)

    myGreeting.greet(ouput)
}
