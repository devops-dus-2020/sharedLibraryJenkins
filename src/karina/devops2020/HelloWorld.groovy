package karina.devops2020


class HelloWorld {
    IHelloWorldService service
    public HelloWorld(IHelloWorldService service) {

        this.service = service
    }
   
    String writeHelloWorld() {
        service.writeHelloWorld()
    }

}