package lysori.MemoryConnector

import package lysori.devopsdus2020.*
class memoryConnection implements dataConnection{

    int a = 0 
    void storeAnimal(String animal){

        ++a
    }

    int countAnimals(){
        return a
    }

}