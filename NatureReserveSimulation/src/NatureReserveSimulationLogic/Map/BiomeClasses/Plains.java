package NatureReserveSimulationLogic.Map.BiomeClasses;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Map.Biome;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Plains extends Biome {
    
    protected static ArrayList<String> supportedAnimals;
    protected static ArrayList<String> supportedFoods;
    protected ArrayList<Animal> currentAnimals;
    protected ArrayList<Food> currentFoods;
    
    public Plains(){
        this.name = "Plains";
        supportedAnimals = new ArrayList<>(Arrays.asList("cat", "dog", "cow", "lion"));
        supportedFoods = new ArrayList<>(Arrays.asList("apple", "leaf", "bird", "buffalo", "herbs","shrubs"));
    }

    public ArrayList<String> getSupportedAnimals() {
        return supportedAnimals;
    }

    public ArrayList<String> getSupportedFoods() {
        return supportedFoods;
    }
    
    public void setSetFoods(HashSet<Food> setFoods) {
        this.setFoods = setFoods;
    }
}
