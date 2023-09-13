package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Lion extends Animal{
    
    public Lion(Species specie) {
        super(specie);
        this.name = "lion";
        this.maximumEnergy = 9999;
        this.currentEnergy = maximumEnergy;
        this.addToDiet("cow");
        this.addToDiet("meat");
        this.addToDiet("pork");
        this.addToDiet("shrubs");
        this.addToDiet("Creepers");
        this.nutritionalValue = 4;
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
    
    @Override
    public void getEated(int howMuchEat){
            
        alive = false;
        currentEnergy -= howMuchEat;
    }
}
