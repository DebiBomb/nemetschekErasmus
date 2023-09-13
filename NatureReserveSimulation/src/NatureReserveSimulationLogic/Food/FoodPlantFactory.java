package NatureReserveSimulationLogic.Food;

import NatureReserveSimulationLogic.Food.FoodClasses.Apple;
import NatureReserveSimulationLogic.Food.FoodClasses.Banana;
import NatureReserveSimulationLogic.Food.FoodClasses.Bird;
import NatureReserveSimulationLogic.Food.FoodClasses.Buffalo;
import NatureReserveSimulationLogic.Food.FoodClasses.Grass;
import NatureReserveSimulationLogic.Food.FoodClasses.Leaf;
import NatureReserveSimulationLogic.Food.FoodClasses.Meat;
import NatureReserveSimulationLogic.Food.FoodClasses.Pork;
import NatureReserveSimulationLogic.Food.FoodClasses.Potato;
import NatureReserveSimulationLogic.Food.FoodClasses.Strawberry;
import NatureReserveSimulationLogic.Plants.PlantsClasses.Climbers;
import NatureReserveSimulationLogic.Plants.PlantsClasses.Creepers;
import NatureReserveSimulationLogic.Plants.PlantsClasses.Herbs;
import NatureReserveSimulationLogic.Plants.PlantsClasses.Shrubs;
import NatureReserveSimulationLogic.Plants.PlantsClasses.Trees;
import NatureReserveSimulationLogic.Plants.SpeciesPlants;
import java.util.ArrayList;

public class FoodPlantFactory {
    
    protected String[] foodPlantNames = {};
    
    public FoodPlantFactory(String[] foodPlantNames){
        this.foodPlantNames = foodPlantNames;
    }
  
    public Food createPlantFood(String name){
        switch (name) {
            case "apple":
                Apple apple = new Apple();
              return apple;
            case "banana":
                Banana banana = new Banana();
              return banana;
            case "grass":
                Grass grass = new Grass();
              return grass;
            case "leaf":
                Leaf leaf = new Leaf();
              return leaf;
            case "meat":
                Meat meat = new Meat();
              return meat;
            case "pork":
                Pork pork = new Pork();
              return pork;
            case "potato":
                Potato potato = new Potato();
              return potato;
            case "strawberry":
                Strawberry strawberry = new Strawberry();
              return strawberry;
            case "bird":
                Bird bird = new Bird();
              return bird;
            case "buffalo":
                Buffalo buffalo = new Buffalo();
              return buffalo;
            case "climbers":
                Climbers climbers = new Climbers(SpeciesPlants.CLIMBERS);
              return climbers;
            case "creepers":
                Creepers creepers = new Creepers(SpeciesPlants.CREEPERS);
              return creepers;
            case "herbs":
                Herbs herbs = new Herbs(SpeciesPlants.HERBS);
            case "shrubs":
                Shrubs shrubs = new Shrubs(SpeciesPlants.SHRUBS);    
              return shrubs;
            case "trees":
                Trees trees = new Trees(SpeciesPlants.TREES);
              return trees;  
        }
        Apple apple = new Apple();
        return apple;
    }
    
    public ArrayList<Food> CreateAllFoods(int nPlantsFoods){
        
        ArrayList<Food> foods = new ArrayList<>();
        for(int i=0; i<=nPlantsFoods; i++){
            int nRandom = (int)Math.floor(Math.random() * (foodPlantNames.length - 1 + 1) + 0);
            foods.add(createPlantFood(foodPlantNames[nRandom]));
            }
        return foods;
    }
    
}
