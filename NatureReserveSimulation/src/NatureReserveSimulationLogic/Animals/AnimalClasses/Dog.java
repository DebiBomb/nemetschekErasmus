package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;
import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;

public class Dog extends Animal{
    
    public Dog(int maximumEnergy, Species specie,  ArrayList<Food> diet) {   
        super(maximumEnergy, specie, diet);
    }
     
}
