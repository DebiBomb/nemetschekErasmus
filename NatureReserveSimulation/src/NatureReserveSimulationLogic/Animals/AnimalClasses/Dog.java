package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Dog extends Animal{
    
    public Dog(Species specie) {   
        super(specie);
        this.name = "dog";
        this.maximumEnergy = 9999;
        this.currentEnergy = maximumEnergy;
        this.addToDiet("cat");
        this.addToDiet("potato");
        this.addToDiet("apple");
        this.addToDiet("herbs");
        this.addToDiet("trees");
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
    
    @Override
    public void getEated(int howMuchEat){
            
        alive = false;
        currentEnergy -= howMuchEat;
    }
     
}
