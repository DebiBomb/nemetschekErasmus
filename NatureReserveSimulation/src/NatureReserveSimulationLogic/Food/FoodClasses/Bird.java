package NatureReserveSimulationLogic.Food.FoodClasses;

import NatureReserveSimulationLogic.Food.Food;

public class Bird extends Food{
    
    public Bird() {
        this.name = "bird";
        this.nutritionalValue = 3;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getEated(int howMuchEat) {     
    }
    
    
}
