package NatureReserveSimulationLogic.Plants;

import NatureReserveSimulationLogic.Food.Food;

public abstract class Plant extends Food{
    
    protected int maxNutritionalValue;
    protected SpeciesPlants species;
    protected int nutrientRegenValue;
    
        public Plant(SpeciesPlants species){
            this.species = species;
            this.nutritionalValue = maxNutritionalValue;
        }

    public void setNutritionalValue(int nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
    
    public abstract void regenNutrient();
}
