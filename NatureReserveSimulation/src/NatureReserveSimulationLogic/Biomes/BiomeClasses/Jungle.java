package NatureReserveSimulationLogic.Biomes.BiomeClasses;

import NatureReserveSimulationLogic.Biomes.Biome;

public class Jungle extends Biome{
    
    protected static String[] supportedAnimals = {"cat", "lion"};
    protected static String[] supportedFoods = {"banana", "leaf", "strawberry", "climbers", "trees"};
    
    public Jungle(){
        this.name = "Forest";
    }
}
