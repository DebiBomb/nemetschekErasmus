package NatureReserveSimulationLogic.Animals.AnimalClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Species;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;

public class Cow extends Animal{
        
    public Cow(int maximumEnergy, Species specie, ArrayList<Food> diet) {
        super(maximumEnergy, specie, diet);

    }        

}
