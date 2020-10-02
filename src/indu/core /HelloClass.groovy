package indu.core

import indu.Connection.*

public class HelloClass{

    HelloInterface hi

public HelloClass(HelloInterface hi)
{
    this.hi = hi
}

public String invokecall()
{
    return hi.call()
}

}
