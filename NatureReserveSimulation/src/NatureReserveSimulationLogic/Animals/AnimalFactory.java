package NatureReserveSimulationLogic.Animals;

import java.util.HashMap;
import java.util.function.Supplier;

public class AnimalFactory {
    
    protected HashMap<String, Supplier<Animal>> animalsMap;
    
    public AnimalFactory(HashMap<String, Supplier<Animal>> animalsMap){
        this.animalsMap = animalsMap;
    }
    
    public Animal createAnimal(String animalName){
        Supplier<Animal> supplierAnimal = animalsMap.get(animalName);
        return supplierAnimal.get();
    }   

    public HashMap<String, Supplier<Animal>> getAnimalsMap() {
        return animalsMap;
    }
    
    
    
}        
