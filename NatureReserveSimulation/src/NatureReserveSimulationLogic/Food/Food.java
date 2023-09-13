package NatureReserveSimulationLogic.Food;

public abstract class Food {
    
    protected String name;
    protected int nutritionalValue;
    
    public String getName() {
        return name;
    }

    public void setNutritionalValue(int nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
   
    public int getNutritionalValue() {
        return nutritionalValue;
    }   
    
    public abstract void getEated(int howMuchEat); 
}
