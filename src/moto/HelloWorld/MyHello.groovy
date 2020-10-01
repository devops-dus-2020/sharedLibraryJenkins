package moto.HelloWorld

class MyHello {
    IHelloService service
    public MyHello(IHelloService service)
    {
        this.service = service
    }

    String checkHello()
    {
        service.checkHello()
    }
}