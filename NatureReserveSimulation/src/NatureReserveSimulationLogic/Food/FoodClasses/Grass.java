package NatureReserveSimulationLogic.Food.FoodClasses;

import NatureReserveSimulationLogic.Food.Food;

public class Grass extends Food{
    
    public Grass() {
        this.name = "grass";
        this.nutritionalValue = 1;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getEated(int howMuchEat) {     
    }
    
    
    
}
