package NatureReserveSimulationLogic.Plants.PlantsClasses;

import NatureReserveSimulationLogic.Plants.Plant;

public class Herbs extends Plant{
    
    public Herbs() {
        this.maxNutritionalValue = 8;
        this.nutritionalValue = maxNutritionalValue;
        this.name = "herbs";
        this.nutrientRegenValue = 2;
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
