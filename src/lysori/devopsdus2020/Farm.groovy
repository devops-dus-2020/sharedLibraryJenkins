package lysori.devopsdus2020

class Farm {

    dataConnection dc 
    public Farm(dataConnection dc){

        this.dc = dc
    }

    public void Add(String name){
        dc.storeAnimal(name)
    }

    public int countAnimals(){
        return dc.countAnimals()
    }
}