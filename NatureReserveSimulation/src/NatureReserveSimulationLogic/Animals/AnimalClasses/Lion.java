package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Lion extends Animal{
    
    public Lion(int maximumEnergy, Species specie) {
        super(maximumEnergy, specie);
        this.addToDiet("meat");
        this.addToDiet("pork");
    }

    @Override
    public void starvingSound() {
        if(this.currentEnergy < (this.maximumEnergy / 2)){
            System.out.println("Roar!!!");
        }
    }

    @Override
    public void growChanges() {
        switch (this.lifespan) {
            case 10:
              this.addToDiet("bird");
            case 20:
              this.addToDiet("buffalo");
            case 30:
              this.addToDiet("strawberry");
        }     
    }
}
