package NatureReserveSimulationLogic.Food.FoodClasses;

import NatureReserveSimulationLogic.Food.Food;

public class Pork extends Food{
    
    public Pork() {
        this.name = "pork";
        this.nutritionalValue = 4;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getEated(int howMuchEat) {     
    }
    
    
    
}
