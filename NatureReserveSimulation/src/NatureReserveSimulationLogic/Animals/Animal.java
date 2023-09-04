package NatureReserveSimulationLogic.Animals;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;

public abstract class Animal{

    protected int currentEnergy;
    protected int maximumEnergy;
    protected ArrayList<Food> diet;
    protected Species specie;
    
    public Animal(int maximumEnergy, Species specie, ArrayList<Food> diet){
        
        this.maximumEnergy = maximumEnergy;
        this.currentEnergy = maximumEnergy;
        this.diet = diet;
        this.specie = specie;
    }
    
    public void Feeding(Food food){
        
        if (isInTheDied(food) && currentEnergy != maximumEnergy)
            currentEnergy ++;
        
        currentEnergy --;   
    }  
    
    public boolean isInTheDied(Food food){
            
            ArrayList<Food> foods;
            foods = this.diet;
            
            for(Food f : foods){
                
                if(f == food)
                    return true;
            }
            
            return false;
        }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    @Override
    public String toString() {
        return ("His species it's "+this.specie+" and his current energy it's: "+this.currentEnergy);
    }
       
}
