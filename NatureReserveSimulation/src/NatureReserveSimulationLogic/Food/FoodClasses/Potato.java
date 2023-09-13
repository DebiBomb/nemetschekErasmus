package NatureReserveSimulationLogic.Food.FoodClasses;

import NatureReserveSimulationLogic.Food.Food;

public class Potato extends Food{
    
    public Potato() {
        this.name = "potato";
        this.nutritionalValue = 3;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getEated(int howMuchEat) {     
    }
    
    
    
}
