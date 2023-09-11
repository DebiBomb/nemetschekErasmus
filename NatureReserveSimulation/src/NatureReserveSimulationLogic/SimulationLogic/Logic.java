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
    
    protected ArrayList<Animal> animals;
    protected int currentTurn;
    
    public Logic(ArrayList<Animal> animals) {
        this.animals = animals;
        currentTurn = 0;
    }
 
    public void startSimulation() {
        
        Food food = new Food();
        
        while (!allAnimalsDead() && currentTurn < 100) {
            currentTurn++;
            System.out.println("Turn---------------------------" + currentTurn);
            
            for (Animal animal : animals) {
                animal.growChanges();
                if (animal.isAlive()) {
                    animal.increaseLifespan();
                    food = generateRandomFood();
                    animal.Feeding(food);
                    isAnotherAnimal(food, animal);
                    if (!animal.isAlive()) {
                        System.out.println(animal.getSpecie()+ " died ");
                    }
                }
            }
        }

        // Calculate statistics
        String nMin = calculateMinLifespan();
        String nMax = calculateMaxLifespan();
        String nAverage = calculateAverageLifespan();

        Statistics statistics = new Statistics(nMin, nMax, nAverage);
        System.out.println("\nSTATISTICS:\n" + statistics);
    }
    
    private boolean allAnimalsDead() {
        for (Animal animal : animals) {
            if (animal.isAlive()) {
                return false;
            }
        }
        return true;
    }
    
    private String calculateMinLifespan() {
        int minLifespan = Integer.MAX_VALUE;
        String minLifespanPlusAnimal = "";
        for (Animal animal : animals) {
            int lifespan = animal.getLifespan();
            if (lifespan < minLifespan) {
                minLifespan = lifespan;
                minLifespanPlusAnimal = (Integer.toString(minLifespan)) + " and was made by: " + (animal.getSpecie());
            }
        }
        return minLifespanPlusAnimal;
    }

    private String calculateMaxLifespan() {
        int maxLifespan = 0;
        String maxLifespanPlusAnimal = "";
        for (Animal animal : animals) {
            int lifespan = animal.getLifespan();
            if (lifespan > maxLifespan) {
                maxLifespan = lifespan;
                maxLifespanPlusAnimal = (Integer.toString(maxLifespan)) + " and was made by: " + (animal.getSpecie());            }
        }
        return maxLifespanPlusAnimal;
    }

    private String calculateAverageLifespan() {
        int totalLifespan = 0;
        int realTotalLifespan = 0;
        String averangeLifespanPlusAnimal = "";
        for (Animal animal : animals) {
            totalLifespan += animal.getLifespan();
        }
        realTotalLifespan = totalLifespan / animals.size();
        return averangeLifespanPlusAnimal = (Integer.toString(realTotalLifespan));
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
        Bird bird = new Bird();
        Buffalo buffalo = new Buffalo();
        Cat cat = new Cat(Species.CAT);
        Cow cow = new Cow(Species.COW);
        Dog dog = new Dog(Species.DOG);
        Lion lion = new Lion(Species.LION);
                
        Random r = new Random();
        int nRandom = (int)Math.floor(Math.random() * (13 - 0 + 1) + 0);
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
            case 8:
              return bird;
            case 9:
              return buffalo;
            case 10:
              return cat;
            case 11:
              return cow;
            case 12:
              return dog;
            case 13:
              return lion;
        }      
        return null;
    } 
    
        public void isAnotherAnimal(Food food, Animal animal){      
        
            for(int i=0; i<animals.size(); i++){
                
                if(animal.isInTheDiet(food)){
                    if(food.equals(animals.get(i))){
                        animals.get(i).setCurrentEnergy(0);
                        System.out.println(animals.get(i).getSpecie() + " was eated");
                    }
                }
            }
    }
  
}