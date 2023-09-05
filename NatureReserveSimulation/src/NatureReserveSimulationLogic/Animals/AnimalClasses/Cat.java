package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Food.FoodClasses.Apple;
import java.util.ArrayList;

public class Cat extends Animal{
    
    public Cat(int maximumEnergy, Species specie) {
        super(maximumEnergy, specie);
        this.addToDiet("apple");
        this.addToDiet("banana");
        
        
    }  
    
}
