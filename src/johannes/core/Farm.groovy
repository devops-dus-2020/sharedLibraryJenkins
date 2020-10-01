package johannes.core

class Farm{
    dataConnection dc
    public Farm(dataConnection dc)
    {
        this.dc = dc
    }

    public void Add(String name)
    {
        dc.storeAnimal(name)
    }

    public int GetAnimalCount()
    {
        return dc.countAnimals();
    }
}