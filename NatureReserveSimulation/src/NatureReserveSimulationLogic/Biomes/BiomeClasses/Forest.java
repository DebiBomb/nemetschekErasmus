package NatureReserveSimulationLogic.Biomes.BiomeClasses;

import NatureReserveSimulationLogic.Biomes.Biome;

public class Forest extends Biome{
    
    protected static String[] supportedAnimals = {"cow", "dog"};
    protected static String[] supportedFoods = {"meat", "pork", "strawberry", "creepers", "trees"};
    
    public Forest(){
        this.name = "Forest";
    }
}
