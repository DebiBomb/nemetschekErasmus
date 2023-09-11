package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Dog extends Animal{
    
    public Dog(Species specie) {   
        super(specie);
        this.name = "dog";
        this.maximumEnergy = 12;
        this.currentEnergy = maximumEnergy;
        this.addToDiet("cat");
        this.addToDiet("potato");
        this.addToDiet("apple");
        this.nutritionalValue = 4;
    }

    @Override
    public void starvingSound() {
        if(this.currentEnergy < (this.maximumEnergy / 2)){
            System.out.println("Bau Bau!!!");
        }
    }

    @Override
    public void growChanges() {
        switch (this.lifespan) {
            case 10:
              this.addToDiet("grass");
            case 20:
              this.addToDiet("bird");
            case 30:
              this.addToDiet("meat");
        }     
    }
     
}
