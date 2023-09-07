package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Cat extends Animal{
    
    public Cat(int maximumEnergy, Species specie) {
        super(maximumEnergy, specie);
        this.addToDiet("bird");
        this.addToDiet("grass");  
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
