package lysori.devopsdus2020

class HelloWorld {

    HelloWorldInterface service

    public HelloWorld (HelloWorldInterface service) {
        this.service = service
    }

    Boolean checkSetup(){
       
       service.checkSetup()
    
    }

    String echoHelloWorld(){

        service.echoHelloWorld()
    }

    String generellGenerator(int a){
        service.generellGenerator(a)
    }

}