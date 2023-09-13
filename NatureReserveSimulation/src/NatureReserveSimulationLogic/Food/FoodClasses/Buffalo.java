package NatureReserveSimulationLogic.Food.FoodClasses;

import NatureReserveSimulationLogic.Food.Food;

public class Buffalo extends Food{
    
    public Buffalo() {
        this.name = "buffalo";
        this.nutritionalValue = 5;
    }

    public String getName() {
        return name;
    }

    @Override
    public void getEated(int howMuchEat) {     
    }
      
}
