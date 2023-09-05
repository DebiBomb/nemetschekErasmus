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
    
    private ArrayList<Animal> animals;
    
    public Logic() {
        animals = new ArrayList<>();
    }
 
    public void startSimulation(int nAnimal) {
        animals = generateAnimal(nAnimal);

        // Simulate the game until all animals are dead
        while (!allAnimalsDead()) {
            for (Animal animal : animals) {
                animal.Feeding(generateRandomFood());
                animal.simulateTurn();
            }
        }

        // Calculate statistics
        int nMin = calculateMinLifespan();
        int nMax = calculateMaxLifespan();
        double nAverage = calculateAverageLifespan();

        Statistics statistics = new Statistics(nMin, nMax, nAverage);
        System.out.println("Statistics: " + statistics);
    }
    
    private boolean allAnimalsDead() {
        for (Animal animal : animals) {
            if (animal.isAlive()) {
                return false;
            }
        }
        return true;
    }
    
    private int calculateMinLifespan() {
        int minLifespan = Integer.MAX_VALUE;
        for (Animal animal : animals) {
            int lifespan = animal.getLifespan();
            if (lifespan < minLifespan) {
                minLifespan = lifespan;
            }
        }
        return minLifespan;
    }

    private int calculateMaxLifespan() {
        int maxLifespan = 0;
        for (Animal animal : animals) {
            int lifespan = animal.getLifespan();
            if (lifespan > maxLifespan) {
                maxLifespan = lifespan;
            }
        }
        return maxLifespan;
    }

    private double calculateAverageLifespan() {
        int totalLifespan = 0;
        for (Animal animal : animals) {
            totalLifespan += animal.getLifespan();
        }
        return (double) totalLifespan / animals.size();
    }
    
    public ArrayList<Animal> generateAnimal(int nAnimal){
        
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        for(int i=0; i<nAnimal; i++){
            
            ArrayList<Food> dietCat = new ArrayList<Food>();
            Cat cat = new Cat(5, Species.CAT);
            animals.add(cat);
               
            ArrayList<Food> dietCow = new ArrayList<Food>();
            Cow cow = new Cow(8, Species.COW);
            animals.add(cow);
            
            ArrayList<Food> dietDog = new ArrayList<Food>();
            Dog dog = new Dog(6, Species.DOG);
            animals.add(dog);
               
            ArrayList<Food> dietLion = new ArrayList<Food>();
            Lion lion = new Lion(10, Species.LION);
            animals.add(lion);
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
        int nRandom = (int)Math.floor(Math.random() * (7 - 0 + 1) + 0);
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
        
        return null;
    }
    
}
