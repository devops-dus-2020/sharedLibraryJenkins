package lysori.helloWorldConnections

import lysori.devopsdus2020.*

class HelloWorldService implements HelloWorldInterface {

    Boolean checkSetup() {
        return true
    }

    String echoHelloWorld(){

        return "Hello World"
    }

}