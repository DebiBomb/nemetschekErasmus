package NatureReserveSimulationLogic.Plants.PlantsClasses;

import NatureReserveSimulationLogic.Food.Plant;

public class Creepers extends Plant{
    
    public Creepers() {
        super();
        this.maxNutritionalValue = 9;
        this.nutritionalValue = maxNutritionalValue;
        this.name = "creepers";
        this.nutrientRegenValue = 1;
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
    
