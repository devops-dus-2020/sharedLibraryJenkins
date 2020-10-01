package moto.HelloConnections

import moto.HelloWorld.*

class HelloService implements IHelloService
{
    String checkHello()
    {
        return 'Hello World'
    }
}