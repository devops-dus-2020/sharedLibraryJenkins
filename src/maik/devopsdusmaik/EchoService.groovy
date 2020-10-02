package maik.devopsdusmaik

import maik.core.*

class EchoService implements IEchoService
{
    String Name()
    {
       println "this is my external code"
    }
}