package NatureReserveSimulationLogic.Plants.PlantsClasses;

import NatureReserveSimulationLogic.Plants.Plant;
import NatureReserveSimulationLogic.Plants.SpeciesPlants;

public class Herbs extends Plant{
    
    public Herbs(SpeciesPlants species) {
        super(species);
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
    
}
