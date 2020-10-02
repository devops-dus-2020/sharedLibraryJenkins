package indu.tests

import indu.core.*
import org.junit.jupiter.api.*

class Testhello {

@Test
void testhello()
{
def stub =[call: {"Hello"}] as HelloInterface
HelloClass hc = new HelloClass(stub)
assert hc.invokecall() == "Hello"

} 

}