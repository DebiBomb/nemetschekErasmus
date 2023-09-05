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
                    nAverange+=(nMax/nAnimal);
                }else if(isDied(animal)){
                    isAllDied ++;
                    nAverange+=(nMax/nAnimal);
                }
            }         
        }
        
        Statistics statistics = new Statistics((nMin / nAnimal),(nMax / nAnimal),((nAverange / nAnimal) / nAnimal));
        
        return statistics;
    }
    
    public ArrayList<Animal> generateAnimal(int nAnimal){
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        for(int i=0; i<nAnimal; i++){
            
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
                System.out.println("mela");
              return apple;
            case 1:
                System.out.println("banana");
              return banana;
            case 2:
                System.out.println("erba");
              return grass;
            case 3:
                System.out.println("foglia");
              return leaf;
            case 4:
                System.out.println("carne");
              return meat;
            case 5:
                System.out.println("maiale");
              return pork;
            case 6:
                System.out.println("patata");
              return potato;
            case 7:
                System.out.println("fragola");
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
