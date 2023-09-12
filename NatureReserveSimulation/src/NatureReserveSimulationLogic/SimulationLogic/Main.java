package NatureReserveSimulationLogic.SimulationLogic;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalFactory;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Food.FoodFactory;
import NatureReserveSimulationLogic.Plants.Plant;
import NatureReserveSimulationLogic.Plants.PlantsFactory;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        String[] animalNames = {"cat", "cow", "dog", "lion"};
        String[] plantsNames = {"climbers", "creepers", "herbs", "shrubs", "trees"};
        String[] foodNames = {"apple", "banana", "bird", "buffalo", "grass", "leaf", "meat", "pork", "potato", "strawberry"};
        
        AnimalFactory animalFactory = new AnimalFactory(animalNames);
        PlantsFactory plantsFactory = new PlantsFactory(plantsNames);
        FoodFactory foodFactory = new FoodFactory(foodNames);
        
        ArrayList<Plant> plants = plantsFactory.CreateAllPlants(4);
        ArrayList<Animal> animals = animalFactory.CreateAllAnimals(3);
        ArrayList<Food> foods = foodFactory.CreateAllFoods(19);
        
        Logic l = new Logic(animals, plants, foods);
        l.startSimulation();
    }
    
}
