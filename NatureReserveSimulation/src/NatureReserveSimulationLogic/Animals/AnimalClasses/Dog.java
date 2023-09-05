package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Dog extends Animal{
    
    public Dog(int maximumEnergy, Species specie) {   
        super(maximumEnergy, specie);
        this.addToDiet("potato");
        this.addToDiet("strawberry");
    }
     
}
