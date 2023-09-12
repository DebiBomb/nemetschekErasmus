package NatureReserveSimulationLogic.Plants.PlantsClasses;

import NatureReserveSimulationLogic.Plants.Plant;
import NatureReserveSimulationLogic.Plants.SpeciesPlants;

public class Creepers extends Plant{
    
    public Creepers(SpeciesPlants species) {
        super(species);
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
    
}
    
