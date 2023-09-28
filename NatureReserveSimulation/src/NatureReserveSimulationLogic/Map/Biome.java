package NatureReserveSimulationLogic.Map;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Food.Plant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public abstract class Biome {
    
    protected String name; 
    protected ArrayList<Animal> currentAnimals;
    protected ArrayList<Food> currentFoods;
    protected static ArrayList<String> supportedAnimals;
    protected static ArrayList<String> supportedFoods;
    protected int x,y;
    protected String animalMinLifespan;
    protected String animalMaxLifespan;
    
    protected HashSet<Food> setFoods;  
    
    public boolean isAllDead() {
        for(Animal animal : this.currentAnimals){
            if(animal.isAlive())
                return false;
        }
        return true;
    }
    
    public void ResetHaveEat(){
        for(Animal animal : currentAnimals){    
            animal.setHaveEat(false);
        }       
    }
    
    public void Feeding(){
        for (Animal animal : currentAnimals) {
                
            if(!animal.isHaveEat()){
            
                if (animal.isAlive()){
                    
                    animal.increaseLifespan();
                    Food food = takeRandomFood();
                    if(animal.Feeding(food)){ 
                        food.getEated(animal.getMaximumEnergy() - animal.getCurrentEnergy());
                        
                        for(Animal a : currentAnimals){
                            if(setFoods.contains(a))
                                a.getEated(animal.getMaximumEnergy() - animal.getCurrentEnergy()); 
                        }
                    }
                    
                }else{
                    System.out.println(animal.getName() + " IS DEAD");
                }      
           }
        }
    }
    
    public Food takeRandomFood(){ 
        Random r = new Random();
        int RandomIndex = 0;
        RandomIndex = r.nextInt(currentFoods.size());
        return currentFoods.get(RandomIndex);
    }
    
    public int calculateMinLifespan() {
        int minLifespan = Integer.MAX_VALUE;
        for (Animal animal : currentAnimals) {
            int lifespan = animal.getLifespan();
            if (lifespan < minLifespan){
                minLifespan = lifespan;
                animalMinLifespan = animal.getName();
            }
        }
        return minLifespan;
    }

    public int calculateMaxLifespan() {
        int maxLifespan = Integer.MIN_VALUE;
        for (Animal animal : currentAnimals) {
            int lifespan = animal.getLifespan();
            if (lifespan > maxLifespan){
                maxLifespan = lifespan;
                animalMaxLifespan = animal.getName();
            }
        }  
       
        return maxLifespan;      
    }

    public int calculateAverageLifespan() {
        int totalLifespan = 0;
        int realTotalLifespan = 0;
        for (Animal animal : currentAnimals) {
            totalLifespan += animal.getLifespan();
        }
        if(currentAnimals.size() > 0)
            realTotalLifespan = totalLifespan / currentAnimals.size();
        
        return realTotalLifespan;
    }
    
    public void allPlantsRegenNutrional(){
        for(Food food : currentFoods){
            if(food instanceof Plant)
                ((Plant) food).regenNutrient();
        }
    }
    
    public ArrayList<String> getSupportedAnimals() {
        return supportedAnimals;
    }

    public ArrayList<String> getSupportedFoods() {
        return supportedFoods;
    }

    public String getAnimalMinLifespan() {
        return animalMinLifespan;
    }

    public String getAnimalMaxLifespan() {
        return animalMaxLifespan;
    }

    public ArrayList<Food> getCurrentFoods() {
        return currentFoods;
    }

    public void setSetFoods(HashSet<Food> setFoods) {
        this.setFoods = setFoods;
    } 

    @Override
    public String toString() {
        return this.name.toUpperCase();
    }
}
