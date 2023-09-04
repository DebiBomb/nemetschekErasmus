package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;

public class Cat extends Animal{
    
    
    public Cat(int maximumEnergy, Species specie, ArrayList<Food> diet) {
        super(maximumEnergy, specie, diet);
        
    }  
    
}
