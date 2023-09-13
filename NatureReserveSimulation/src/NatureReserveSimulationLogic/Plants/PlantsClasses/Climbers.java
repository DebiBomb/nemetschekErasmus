package NatureReserveSimulationLogic.Plants.PlantsClasses;

import NatureReserveSimulationLogic.Plants.Plant;

public class Climbers extends Plant{
    
    public Climbers() {
        this.maxNutritionalValue = 10;
        this.nutritionalValue = maxNutritionalValue;
        this.name = "climbers";
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
