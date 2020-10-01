package johannes.MemoryConnector

import johannes.core.*

class memoryConnection implements dataConnection
{
    int a = 0;
    void storeAnimal(String animal)
    {
        ++a;
    }

    int countAnimals()
    {
        return a;
    }
}