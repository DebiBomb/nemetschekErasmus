package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Cow extends Animal{
        
    public Cow(int maximumEnergy, Species specie) {
        super(maximumEnergy, specie);
        this.addToDiet("grass");
        this.addToDiet("leaf");

    }        

    @Override
    public void starvingSound() {
        if(this.currentEnergy < (this.maximumEnergy / 2)){
            System.out.println("Muuu!!!");
        }
    }

    @Override
    public void growChanges() {
        switch (this.lifespan) {
            case 10:
              this.addToDiet("apple");
            case 20:
              this.addToDiet("banana");
            case 30:
              this.addToDiet("potato");
        }     
    }

}
