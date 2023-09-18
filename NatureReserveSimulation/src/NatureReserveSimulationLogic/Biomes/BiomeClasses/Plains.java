package NatureReserveSimulationLogic.Biomes.BiomeClasses;

import NatureReserveSimulationLogic.Biomes.Biome;

public class Plains extends Biome {
    
    protected static String[] supportedAnimals = {"cat", "dog", "cow"};
    protected static String[] supportedFoods = {"apple", "leaf", "bird", "buffalo", "Herbs", "shrubs"};
    
    public Plains(){
        this.name = "Plains";        
    }
    
}
