package andreas

class GreetingService implements InterfaceGreetingService {
    InterfaceJenkinsLogger logger

    // Constructor
    GreetingService(InterfaceJenkinsLogger bindingout) {
        this.logger = bindingout
    }

    void print(String output) {
        logger.println('In GreetingService.greet()')
        logger.print(output)
    }
    void println(String output) {
        logger.println('In GreetingService.greet()')
        logger.print(output)
    }
}
