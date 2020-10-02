import andreas.*

def greet(variable) {
    echo '${variable}'


    String output = '${variable}'
    println "In vars/greeting.greet"
    
    GreetingService service = new GreetingService()
    Greeting myGreeting = new Greeting(service)

    myGreeting.greet(output)

}
