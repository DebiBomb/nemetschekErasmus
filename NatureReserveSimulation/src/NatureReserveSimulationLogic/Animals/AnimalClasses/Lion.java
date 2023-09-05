package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Lion extends Animal{
    
    public Lion(int maximumEnergy, Species specie) {
        super(maximumEnergy, specie);
        this.addToDiet("meat");
        this.addToDiet("pork");
    }
}
