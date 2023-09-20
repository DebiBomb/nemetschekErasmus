package NatureReserveSimulationLogic.Map;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;

public abstract class Biome {
    
    protected String name; 
    protected ArrayList<Animal> currentAnimals;
    protected ArrayList<Food> currentFoods;
    protected static ArrayList<String> supportedAnimals;
    protected static ArrayList<String> supportedFoods;
    protected int x,y;

    public ArrayList<String> getSupportedAnimals() {
        return supportedAnimals;
    }

    public ArrayList<String> getSupportedFoods() {
        return supportedFoods;
    }
    
    
}
