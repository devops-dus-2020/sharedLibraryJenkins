package Moritz.helloworldConnections  //= externe Klasse außerhalb des cores

import Moritz.moritzdevops.*

class MyHelloWorldService implements HelloWorldInterface   //6.
{
    Boolean checkEcho()
    {
        return true
    }
    String echoMyHelloWorld()
    {
        return "Hello Word"
    }

}