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
import java.util.ArrayList;

public class FoodFactory {
    
    protected String[] foodNames = {};
    
    public FoodFactory(String[] foodNames){
        this.foodNames = foodNames;
    }
  
    public Food createFood(String name){
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
        }
        Apple apple = new Apple();
        return apple;
    }
    
    public ArrayList<Food> CreateAllFoods(int nFoods){
        
        ArrayList<Food> foods = new ArrayList<>();
        for(int i=0; i<=nFoods; i++){
            int nRandom = (int)Math.floor(Math.random() * (foodNames.length - 1 + 1) + 0);
            foods.add(createFood(foodNames[nRandom]));
            }
        return foods;
    }
    
}
