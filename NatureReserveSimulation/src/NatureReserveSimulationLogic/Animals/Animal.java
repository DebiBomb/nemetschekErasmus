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
        this.lifespan = lifespan;
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
            if(this.currentEnergy < this.maximumEnergy){
                System.out.println(this.specie + " have eat: " + food.getName() + ", it's in his diet");
                currentEnergy ++;
            }else if(this.currentEnergy == this.maximumEnergy){
                System.out.println(this.specie + " have eat: " + food.getName() + ", it's in his diet, but it's FULL of energy"); 
            }
            }else{
                System.out.println(this.specie + " have eat: " + food.getName() + ", it's NOT in his diet");
                starvingSound();
                currentEnergy --; 
        }
    }  
    
    public abstract void starvingSound();
    
    public abstract void growChanges();
    
    public boolean isInTheDiet(Food food) {
        return this.diet.contains(food.getName());
    }   
    
    public int getCurrentEnergy() {
        return currentEnergy;
    }
    
    public void increaseLifespan() {
            lifespan++;
    }

    public boolean isAlive() {
        if(currentEnergy < 0){
            alive = false;
            return false;
        }
        return true;
    }

    public int getLifespan() {
        return lifespan;
    }

    public Species getSpecie() {
        return specie;
    }
    
    @Override
    public String toString() {
        return ("His species it's "+this.specie+" and his current energy it's: "+this.currentEnergy);
    }
       
}
