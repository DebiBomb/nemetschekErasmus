package NatureReserveSimulationLogic.Animals;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;

public class Animal{

    private int currentEnergy;
    private int maximumEnergy;
    private Diet diet;
    private Species specie;
    
    public Animal(int maximumEnergy,Diet diet, Species specie){
        
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
            
            ArrayList<Food> foods = this.diet.getFoods();
            
            for(Food f : foods){
                
                if(f == food)
                    return true;
            }
            
            return false;
        }
    
    public boolean isDied(){
        if(currentEnergy == 0)
            return true; 
        
        return false;
    }

    @Override
    public String toString() {
        return ("His species it's "+this.specie+" and his current energy it's: "+this.currentEnergy);
    }
    
    
}
