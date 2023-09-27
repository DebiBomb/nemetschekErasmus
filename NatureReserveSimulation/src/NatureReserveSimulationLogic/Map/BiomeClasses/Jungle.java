package NatureReserveSimulationLogic.Map.BiomeClasses;

import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Map.Biome;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Jungle extends Biome{
    
    protected static ArrayList<String> supportedAnimals;
    protected static ArrayList<String> supportedFoods;
    
    public Jungle(){
        this.name = "Jungle";
        supportedAnimals = new ArrayList<>(Arrays.asList("cat", "lion"));
        supportedFoods = new ArrayList<>(Arrays.asList("banana", "leaf", "strawberry", "climbers", "trees"));     
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
