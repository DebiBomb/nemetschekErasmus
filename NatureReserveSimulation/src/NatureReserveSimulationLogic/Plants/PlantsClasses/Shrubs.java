package NatureReserveSimulationLogic.Plants.PlantsClasses;

import NatureReserveSimulationLogic.Food.Plant;

public class Shrubs extends Plant{
    
    public Shrubs() {
        this.maxNutritionalValue = 7;
        this.nutritionalValue = maxNutritionalValue;
        this.name = "shrubs";
        this.nutrientRegenValue = 3;
    }
    
    @Override
    public void regenNutrient() {
        if((nutritionalValue + nutrientRegenValue) <= maxNutritionalValue){
            nutritionalValue += nutrientRegenValue;
        }
        else{
            nutritionalValue = maxNutritionalValue;
        }    
    }
    
    @Override
    public void getEated(int howMuchEat) {
        
        nutritionalValue -= howMuchEat;
    }
    
}
    
