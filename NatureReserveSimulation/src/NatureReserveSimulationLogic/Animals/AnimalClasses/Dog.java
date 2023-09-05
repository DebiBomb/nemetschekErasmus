package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;
import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Dog extends Animal{
    
    protected ArrayList<String> diet = new ArrayList<String>();
    
    public Dog(int maximumEnergy, Species specie) {   
        super(maximumEnergy, specie);
        this.diet.add("apple");
        this.diet.add("banana");
    }
     
}
