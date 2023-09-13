package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;

public class Cow extends Animal{
        
    public Cow() {
        this.name = "cow";
        this.maximumEnergy = 15;
        this.currentEnergy = maximumEnergy;
        this.addToDiet("grass");
        this.addToDiet("leaf");
        this.addToDiet("creepers");
        this.addToDiet("shrubs");
        this.addToDiet("potato");
        this.nutritionalValue = 5;

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
    
    @Override
    public void getEated(int howMuchEat){
            
        alive = false;
        currentEnergy -= howMuchEat;
    }
    
    

}
