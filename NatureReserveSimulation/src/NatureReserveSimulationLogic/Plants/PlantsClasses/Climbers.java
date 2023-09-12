package NatureReserveSimulationLogic.Plants.PlantsClasses;

import NatureReserveSimulationLogic.Plants.Plant;
import NatureReserveSimulationLogic.Plants.SpeciesPlants;

public class Climbers extends Plant{
    
    public Climbers(SpeciesPlants species) {
        super(species);
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
    
}
