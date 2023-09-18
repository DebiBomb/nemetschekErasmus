package NatureReserveSimulationLogic.Food;

import java.util.HashMap;
import java.util.function.Supplier;

public class FoodFactory {
    
    protected HashMap<String, Supplier<Food>> foodsMap;
    
    public FoodFactory(HashMap<String, Supplier<Food>> foodsMap){
        this.foodsMap = foodsMap;
    }
    
    public Food createFood(String foodName){
        Supplier<Food> supplierFood = foodsMap.get(foodName);
        return supplierFood.get();
    }   

    public HashMap<String, Supplier<Food>> getFoodsMap() {
        return foodsMap;
    }    
}  
    
