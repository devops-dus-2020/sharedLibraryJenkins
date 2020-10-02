package sevcan.devopsdus2020
import sevcan.detail.*

class NumberGenerator {
    IDataConnection dc;

    public NumberGenerator(IDataConnection service)
   {
      this.dc = service
    }

    int generate()
    {
    return dc.generate()
    }


}