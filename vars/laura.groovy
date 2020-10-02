import laura.devopsdus2020.*
import laura.details.*

def checkGeneratorService() {
    IGeneratorService service = new GeneratorService();
    NumberGenerator generator = new NumberGenerator(service);
    int number = generator.generateNumber()

    println(number);
    println("laura");
}
