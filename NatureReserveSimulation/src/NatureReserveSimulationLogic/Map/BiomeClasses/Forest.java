package NatureReserveSimulationLogic.Map.BiomeClasses;

import NatureReserveSimulationLogic.Map.Biome;
import java.util.ArrayList;
import java.util.Arrays;

public class Forest extends Biome{
    
    protected static ArrayList<String> supportedAnimals;
    protected static ArrayList<String> supportedFoods; 
    
    public Forest(){
        this.name = "Forest";
        supportedAnimals = new ArrayList<>(Arrays.asList("cow", "dog"));
        supportedFoods = new ArrayList<>(Arrays.asList("meat", "pork", "strawberry", "creepers", "trees"));
    }

    public ArrayList<String> getSupportedAnimals() {
        return supportedAnimals;
    }

    public ArrayList<String> getSupportedFoods() {
        return supportedFoods;
    }
      
}
