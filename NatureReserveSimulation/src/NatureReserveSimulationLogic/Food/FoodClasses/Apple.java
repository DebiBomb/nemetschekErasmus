package NatureReserveSimulationLogic.Food.FoodClasses;

import NatureReserveSimulationLogic.Food.Food;

public class Apple extends Food{
    
    public Apple() {
        this.name = "apple";
        this.nutritionalValue = 2;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getEated(int howMuchEat) {     
    }
    
}
