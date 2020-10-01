import andreas.*

def greet(ouput) {
    println "In vars/greeting.greet"
    println "${output}"
    
    GreetingService service = new GreetingService()
    Greeting myGreeting = new Greeting(service)

    myGreeting.greet("${ouput}")
}
