package NatureReserveSimulationLogic.SimulationLogic;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalClasses.*;
import NatureReserveSimulationLogic.Animals.AnimalFactory;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Food.FoodClasses.*;
import NatureReserveSimulationLogic.Food.FoodFactory;
import NatureReserveSimulationLogic.Map.Biome;
import NatureReserveSimulationLogic.Map.BiomeClasses.*;
import NatureReserveSimulationLogic.Map.BiomeFactory;
import NatureReserveSimulationLogic.Map.Map;
import NatureReserveSimulationLogic.Plants.PlantsClasses.*;
import java.util.HashMap;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        
        HashMap<String, Supplier<Animal>> animalsMap = new HashMap<>();
        
        // Add elements to the HashMap
        animalsMap.put("cat", () -> new Cat());
        animalsMap.put("cow", () -> new Cow());
        animalsMap.put("dog", () -> new Dog());
        animalsMap.put("lion", () -> new Lion());
               
        AnimalFactory animalFactory = new AnimalFactory(animalsMap);
              
        
        HashMap<String, Supplier<Food>> foodsMap = new HashMap<>();
        
        // Add elements to the HashMap
        foodsMap.put("apple", () -> new Apple());
        foodsMap.put("banana", () -> new Banana());
        foodsMap.put("bird", () -> new Bird());
        foodsMap.put("buffalo", () -> new Buffalo());          
        foodsMap.put("grass", () -> new Grass());
        foodsMap.put("leaf", () -> new Leaf());
        foodsMap.put("meat", () -> new Meat());
        foodsMap.put("pork", () -> new Pork());
        foodsMap.put("potato", () -> new Potato());
        foodsMap.put("strawberry", () -> new Strawberry());
        foodsMap.put("climbers", () -> new Climbers());
        foodsMap.put("creepers", () -> new Creepers());          
        foodsMap.put("herbs", () -> new Herbs());
        foodsMap.put("shrubs", () -> new Shrubs());
        foodsMap.put("trees", () -> new Trees());
        foodsMap.put("cat", () -> new Cat());          
        foodsMap.put("cow", () -> new Cow());
        foodsMap.put("dog", () -> new Dog());
        foodsMap.put("lion", () -> new Lion());
               
        FoodFactory foodFactory = new FoodFactory(foodsMap);
        
        HashMap<String, Supplier<Biome>> biomeMap = new HashMap<>();
        
        // Add elements to the HashMap
        biomeMap.put("forest", () -> new Forest());
        biomeMap.put("jungle", () -> new Jungle());
        biomeMap.put("plains", () -> new Plains());
               
        BiomeFactory biomeFactory = new BiomeFactory(biomeMap);
        
        Map map = new Map(animalFactory, foodFactory, biomeFactory);
        map.generateWorld();
        
        Logic l = new Logic(foodFactory, animalFactory, 5, 20);
        l.startSimulation(true);
    }
    
}
