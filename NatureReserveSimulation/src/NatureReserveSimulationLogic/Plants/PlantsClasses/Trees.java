package NatureReserveSimulationLogic.Plants.PlantsClasses;

import NatureReserveSimulationLogic.Plants.Plant;
import NatureReserveSimulationLogic.Plants.SpeciesPlants;

public class Trees extends Plant{
  
    public Trees(SpeciesPlants species) {
        super(species);
        this.maxNutritionalValue = 12;
        this.nutritionalValue = maxNutritionalValue;
        this.name = "trees";
        this.nutrientRegenValue = 4;
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
    

