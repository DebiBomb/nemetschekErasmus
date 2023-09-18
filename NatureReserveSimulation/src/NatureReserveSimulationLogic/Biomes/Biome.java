package NatureReserveSimulationLogic.Biomes;

import NatureReserveSimulationLogic.Animals.Animal;
import java.util.ArrayList;

public abstract class Biome {
    
    protected String name; 
    protected ArrayList<Animal> currentAnimals;
    protected int[][] cordinates;
    protected String[] supportedFoods;
    
}
