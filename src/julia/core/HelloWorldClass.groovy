package julia.core

public class HelloWorldClass{

    HelloWorldInterface hi

public HelloWorldClass(HelloWorldInterface hi)
{
    this.hi = hi
}

public String invokeCall()
{
    return hi.call();
}

}