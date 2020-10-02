package maik.devopsdusmaik
import java.util.logging.Logger

import maik.core.*


class EchoService implements IEchoService
{
    String Name()
    {
      
      String result = 'zweiter morgendlicher stimmtest'
        println result
    
        logger.info result
       
         return "this is my external code"
    }
}