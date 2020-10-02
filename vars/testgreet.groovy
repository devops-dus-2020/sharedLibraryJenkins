import andreas.*


def greet(variable) {
    echo "${variable}"

    //String output = "${variable}"
    println "In vars/testgreet"

    String output = 'This test works!'

    binding.setProperty("out", new PrintWriter(stdout,true))
    def bindingout = getBinding().getProperty('out')
    JenkinsLogger logger = new JenkinsLogger(bindingout)
    GreetingService service = new GreetingService(logger)
    Greeting myGreeting = new Greeting(service)

    //Closure myecho = {String msg -> println msg}
    //myGreeting.redirectEcho("redirected", myecho)

    myGreeting.greet(output)

}
