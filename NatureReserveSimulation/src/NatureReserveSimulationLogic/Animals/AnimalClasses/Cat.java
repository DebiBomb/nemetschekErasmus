package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Cat extends Animal{
    
    public Cat(Species specie) {
        super(specie);
        this.name = "cat";
        this.maximumEnergy = 10;
        this.currentEnergy = maximumEnergy;
        this.addToDiet("bird");
        this.addToDiet("grass"); 
        this.addToDiet("climbers");
        this.addToDiet("trees");
        this.addToDiet("herbs");
        this.nutritionalValue = 3;
    }  

    @Override
    public void starvingSound() {
        if(this.currentEnergy < (this.maximumEnergy / 2)){
            System.out.println("Mao!!!");
        }
    }   

    @Override
    public void growChanges() {
        switch (this.lifespan) {
            case 10:
              this.addToDiet("meat");
            case 20:
              this.addToDiet("leaf");
            case 30:
              this.addToDiet("buffalo");
        }     
    }
}
