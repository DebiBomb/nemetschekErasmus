package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Cow extends Animal{
        
    public Cow(int maximumEnergy, Species specie) {
        super(maximumEnergy, specie);
        this.addToDiet("grass");
        this.addToDiet("leaf");

    }        

}
