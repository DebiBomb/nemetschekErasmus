package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;

public class Lion extends Animal{
    
    protected ArrayList<String> diet = new ArrayList<String>();
    
    public Lion(int maximumEnergy, Species specie) {
        super(maximumEnergy, specie);
        this.diet.add("potato");
        this.diet.add("strawberry");
    }
}
