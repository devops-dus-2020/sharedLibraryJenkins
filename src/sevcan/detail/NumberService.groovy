package sevcan.detail

import sevcan.devopsdus2020.*

class NumberService implements IDataConnection
{

        public int generate()
    {
     x = Math.abs( new Random().nextInt() % (10 - 5)) + 5
         return(x) 
    }
}