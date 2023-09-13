package NatureReserveSimulationLogic.SimulationLogic;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalFactory;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Food.FoodPlantFactory;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        String[] animalsNames = {"cat", "cow", "dog", "lion"};
        String[] foodsNames = {"apple", "banana", "bird", "buffalo", "grass", "leaf", "meat", "pork", "potato", "strawberry", "climbers", "creepers", "herbs", "shrubs", "trees"};
        
        AnimalFactory animalFactory = new AnimalFactory(animalsNames);
        FoodPlantFactory foodPlantFactory = new FoodPlantFactory(foodsNames);
        
        ArrayList<Animal> animals = animalFactory.CreateAllAnimals(3);
        ArrayList<Food> foods = foodPlantFactory.CreateAllFoods(19);
        
        Logic l = new Logic(animals, foods);
        l.startSimulation(true);
    }
    
}
