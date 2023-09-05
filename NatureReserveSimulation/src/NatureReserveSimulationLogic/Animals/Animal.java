package NatureReserveSimulationLogic.Animals;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;

public abstract class Animal{

    protected int currentEnergy;
    protected int maximumEnergy;
    protected ArrayList<String> diet;
    protected Species specie;
    protected int lifespan;
    protected boolean alive;
    
    public Animal(int maximumEnergy, Species specie){
        
        this.maximumEnergy = maximumEnergy;
        this.currentEnergy = maximumEnergy;
        this.specie = specie;
        this.diet = new ArrayList<>();
        this.lifespan = 0;
        this.alive = true;
    }
    
    public void addToDiet(String foodItem) {
        diet.add(foodItem);
    }
    
    public void removeFromDiet(String foodItem) {
        diet.remove(foodItem);
    }
    
    public void Feeding(Food food){
        
        if ((isInTheDiet(food))){
            if(this.currentEnergy != this.maximumEnergy){
            System.out.println("Hi i'm: " + this.specie + " and i eat this: " + food.getName());
            currentEnergy ++;
            }
        }else{
            currentEnergy --; 
        }
    }  
    
    public boolean isInTheDiet(Food food) {
        ArrayList<String> foods = this.diet;

        return foods.contains(food.getName());
}
    public int getCurrentEnergy() {
        return currentEnergy;
    }
    
    public void simulateTurn() {
        if (isAlive())
            lifespan++;
    }

    public boolean isAlive() {
        if(!(this.currentEnergy == 0))
            return true;
        else{
        alive = false;
        return false;
        }
    }

    public int getLifespan() {
        return lifespan;
    }

    @Override
    public String toString() {
        return ("His species it's "+this.specie+" and his current energy it's: "+this.currentEnergy);
    }
       
}
