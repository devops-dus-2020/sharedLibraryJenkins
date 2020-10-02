import andreas.*

def greet(variable) {
    echo "${variable}"


    //String output = "${variable}"
    println "In vars/testgreet"

    String output = 'This test works'

    GreetingService service = new GreetingService()
    Greeting myGreeting = new Greeting(service)
    def closure = (String msg) -> {println msg}
    myGreeting.redirectEcho("redirected", closure)

    myGreeting.greet(output)

}
