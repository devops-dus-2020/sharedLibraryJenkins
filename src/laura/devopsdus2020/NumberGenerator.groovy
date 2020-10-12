package laura.devopsdus2020

import laura.details.*

class NumberGenerator {
    
    IGeneratorService gs;
    int x = 0

    public NumberGenerator(IGeneratorService gs)
    {
        this.gs = gs
    }

    public int generateNumber()
    {   
        int ret = gs.generate();
        x += ret;
        return ret;
    }

    public int calculateNumbers() {
        return x;
    } 

}