package NatureReserveSimulationLogic.SimulationLogic;
import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Statistics.Statistics;
import NatureReserveSimulationLogic.Plants.Plant;
import java.util.ArrayList;
import java.util.Random;

public class Logic {
    
    protected ArrayList<Animal> animals;
    protected ArrayList<Plant> plants;
    protected ArrayList<Food> foods;
    protected int currentTurn;
    
    public Logic(ArrayList<Animal> animals, ArrayList<Plant> plants, ArrayList<Food> foods) {
        this.animals = animals;
        this.plants = plants;
        this.foods = foods;
        currentTurn = 0;
    }
 
    public void startSimulation() {
        
        Food food = new Food();
        
        while (!allAnimalIsDead() && currentTurn < 100) {
            System.out.println("Turn---------------------------" + currentTurn);
            currentTurn++;
            allPlantsRegenNutrional();
            
            for (Animal animal : animals) {
                
                animal.growChanges();             
                food = takeRandomFoodExpandedVersion();
                
                if (animal.isAlive()){
                    animal.increaseLifespan();
                    animal.Feeding(food); 
                    whatHappensToTheFood(food, animal);                   
                }else{
                    System.out.println(animal.getName() + " vital functions stopped");
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
    
    private boolean allAnimalIsDead() {
        for (Animal animal : animals) {
            if (animal.isAlive())
                return false;
        }
        return true;
    }
    
    private void allPlantsRegenNutrional(){
        for(Plant plant : plants){
            plant.regenNutrient();
        }
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
    
    public Food takeRandomFoodExpandedVersion(){
        Random r = new Random();
        int RandomIndex = r.nextInt(3);
        
        switch (RandomIndex) {
            case 0:
                return takeRandomFood();
            case 1:
                return takeRandomAnimal();
            case 2:
                return takeRandomPlant();
        }
        return null;
    }
    
    public Food takeRandomFood(){    
        Random r = new Random();
        int RandomIndex = r.nextInt(foods.size());
        return foods.get(RandomIndex);
    } 
    
    public Animal takeRandomAnimal(){
        Random r = new Random();
        int RandomIndex = r.nextInt(animals.size());
        return animals.get(RandomIndex);
    }
    
    public Plant takeRandomPlant(){
        Random r = new Random();
        int RandomIndex = r.nextInt(plants.size());
        return plants.get(RandomIndex);
    }
    
    public void whatHappensToTheFood(Food food, Animal animal){
        if(animals.contains(food) && animal.isInTheDiet(food)){ 
            System.out.println(food.getName() + " unfortunately he passed away");            
            animals.remove(food);
        }else if(plants.contains(food) && animal.isInTheDiet(food)){
            System.out.println(food.getName() + " has been eated, but some roots remain");
            food.setNutritionalValue(0);
        }else if(animal.isInTheDiet(food)){
            System.out.println(food.getName() + " has been eated");
            foods.remove(food);
        }
    }
}