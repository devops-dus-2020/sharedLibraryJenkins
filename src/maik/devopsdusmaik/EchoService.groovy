package maik.devopsdusmaik

import maik.core.*

class EchoService implements IEchoService
{
    String Name()
    {
       return echo "this is my external code"
    }
}