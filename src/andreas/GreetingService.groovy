package andreas

class GreetingService implements InterfaceGreetingService {



    void greet(String greeting) {
        println 'In GreetingService.greet()'
        println greeting
    }
}
