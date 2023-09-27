package NatureReserveSimulationLogic.Animals;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Map.Biome;
import java.util.ArrayList;

public abstract class Animal extends Food{
      
    protected int currentEnergy;
    protected int maximumEnergy;
    private ArrayList<String> diet;
    protected int lifespan;
    protected boolean alive;
    
    public Animal(){
        this.currentEnergy = maximumEnergy;
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
    
    public ArrayList<Biome> WereCanMove(ArrayList<Biome> nearBiomes){
        ArrayList<Biome> accesibleBiomes = new ArrayList<>();
        for(Biome biome : nearBiomes){
            if(biome.getSupportedAnimals().contains(this.name)){
                accesibleBiomes.add(biome);
            }
        }
        
        return accesibleBiomes;
    }
    
    public boolean Feeding(Food food){
        
        if ((isInTheDiet(food))){
            if((this.currentEnergy + food.getNutritionalValue()) <= this.maximumEnergy){
                System.out.println(this.getName() + " have eat: " + food.getName() + ", it's in his diet");
                currentEnergy += food.getNutritionalValue();
                return true;
            }
            System.out.println(this.getName() + " have eat: " + food.getName() + ", it's in his diet, but it's FULL of energy"); 
        }else{
                System.out.println(this.getName() + " have eat: " + food.getName() + ", it's NOT in his diet");
                starvingSound();
                currentEnergy = ((currentEnergy - food.getNutritionalValue()) > 0) ? currentEnergy -= food.getNutritionalValue() : 0; 
                return false;
        }
        return false;
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
        return ((currentEnergy > 0) && alive == true);
    }

    public int getLifespan() {
        return lifespan;
    }
    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }

    public int getMaximumEnergy() {
        return maximumEnergy;
    }
    
    @Override
    public String toString() {
        return ("" + this.getName() + ": " + currentEnergy + "/" + maximumEnergy);
    }
       
}
