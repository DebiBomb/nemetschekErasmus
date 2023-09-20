package NatureReserveSimulationLogic.Map.BiomeClasses;

import NatureReserveSimulationLogic.Map.Biome;
import java.util.ArrayList;
import java.util.Arrays;

public class Plains extends Biome {
    
    protected static ArrayList<String> supportedAnimals;
    protected static ArrayList<String> supportedFoods;
    
    public Plains(){
        this.name = "Plains";
        supportedAnimals = new ArrayList<>(Arrays.asList("cat", "dog", "cow"));
        supportedFoods = new ArrayList<>(Arrays.asList("apple", "leaf", "bird", "buffalo", "Herbs", "shrubs"));
    }

    public ArrayList<String> getSupportedAnimals() {
        return supportedAnimals;
    }

    public ArrayList<String> getSupportedFoods() {
        return supportedFoods;
    }
    
    
    
}
