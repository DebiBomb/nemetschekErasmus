package NatureReserveSimulationLogic.SimulationLogic;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalClasses.*;
import NatureReserveSimulationLogic.Animals.AnimalFactory;
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
              
        
//        String[] animalsNames = {"cat", "cow", "dog", "lion"};
//        String[] foodsNames = {"apple", "banana", "bird", "buffalo", "grass", "leaf", "meat", "pork", "potato", "strawberry", "climbers", "creepers", "herbs", "shrubs", "trees"};
//        
//        AnimalFactory animalFactory = new AnimalFactory(animalsNames);
//        FoodPlantFactory foodPlantFactory = new FoodPlantFactory(foodsNames);
//        
//        ArrayList<Animal> animals = animalFactory.CreateAllAnimals(3);
//        ArrayList<Food> foods = foodPlantFactory.CreateAllFoods(19);
        
        Logic l = new Logic(foods, animalFactory, 5);
        l.startSimulation(true);
    }
    
}
