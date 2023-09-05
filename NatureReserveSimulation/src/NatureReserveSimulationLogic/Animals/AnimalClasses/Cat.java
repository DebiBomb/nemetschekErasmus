package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Cat extends Animal{
    
    public Cat(int maximumEnergy, Species specie) {
        super(maximumEnergy, specie);
        this.addToDiet("apple");
        this.addToDiet("banana");
        
        
    }  
    
}
