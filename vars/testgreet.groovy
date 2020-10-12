import andreas.*


def greet(variable) {
 
    String output = "${variable}"

    // Initiate JenkinsLogger
    JenkinsLogger logger = new JenkinsLogger({String msg -> println msg})
    GreetingService service = new GreetingService(logger)
    Greeting myGreeting = new Greeting(service)

    // Use Greeting class to print greeting
    myGreeting.greet(output)

}
