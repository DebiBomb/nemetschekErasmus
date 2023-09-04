package NatureReserveSimulationLogic.SimulationLogic;
import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalClasses.*;
import NatureReserveSimulationLogic.Animals.Species;
import NatureReserveSimulationLogic.Food.FoodClasses.*;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Statistics.Statistics;
import java.util.ArrayList;
import java.util.Random;

public class Logic {
     
    private int nAnimal;
    
    public Statistics startSimulation(int nAnimal){
        int nMin = 0, nMax = 0, nAverange = 0;
        int isAllDied = 0;
        boolean firstDied = false;
        ArrayList<Animal> animals = generateAnimal(nAnimal);
        
        while(isAllDied <= nAnimal){
            
            for(Animal animal : animals){
                
                animal.Feeding(generateRandomFood());
                
                if(!firstDied){
                    nMin ++;
                    nMax ++;
                }else{
                    nMax ++;
                }                           
                      
                if(isDied(animal) && !firstDied){                    
                    isAllDied ++;
                    firstDied = true;
                    nAverange+=nMax;
                }else if(isDied(animal)){
                    isAllDied ++;
                    nAverange+=nMax;
                }
            }         
        }
        
        Statistics statistics = new Statistics((nMin / nAnimal),(nMax / nAnimal),(nAverange / nAnimal));
        
        return statistics;
    }
    
    public ArrayList<Animal> generateAnimal(int nAnimal){
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        for(int i=0; i<=nAnimal; i++){
            
            ArrayList<Food> dietCat = new ArrayList<Food>();
            Apple apple = new Apple();
            dietCat.add(apple);
            Cat cat = new Cat(3, Species.CAT, dietCat);
            animals.add(cat);
            
            ArrayList<Food> dietCow = new ArrayList<Food>();
            Grass grass = new Grass();
            dietCow.add(grass);
            Cow cow = new Cow(3, Species.COW, dietCow);
            animals.add(cow);
        }
        return animals;
    }   
    
    public Food generateRandomFood(){
        
        Apple apple = new Apple();
        Banana banana = new Banana();
        Grass grass = new Grass();
        Leaf leaf = new Leaf();
        Meat meat = new Meat();
        Pork pork = new Pork();
        Potato potato = new Potato();
        Strawberry strawberry = new Strawberry();
        
        Random r = new Random();
        int nRandom = (int)Math.floor(Math.random() * (8 - 0 + 1) + 0);
        switch (nRandom) {
            case 0:
              return apple;
            case 1:
              return banana;
            case 2:
              return grass;
            case 3:
              return leaf;
            case 4:
              return meat;
            case 5:
              return pork;
            case 6:
              return potato;
            case 7:
              return strawberry;
        }
        
        return apple;
    }
    
    public boolean isDied(Animal animal){
        if(animal.getCurrentEnergy() == 0)
            return true; 
        
        return false;
    }  
}
