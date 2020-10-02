package andreas

class GreetingService implements InterfaceGreetingService {
    JenkinsLogger logger

    // Constructor
    GreetingService(JenkinsLogger logger) {
        this.logger = logger
    }

    void greet(String output) {
        logger.println('In GreetingService.greet()')
        logger.println(output)
    }
}
