package NatureReserveSimulationLogic.Plants;

import NatureReserveSimulationLogic.Food.Food;

public abstract class Plant extends Food{
    
    protected int maxNutritionalValue;
    protected int nutrientRegenValue;
    
        public Plant(){
            this.nutritionalValue = maxNutritionalValue;
        }

    public void setNutritionalValue(int nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
    
    public abstract void regenNutrient();
}
