package NatureReserveSimulationLogic.SimulationLogic;
import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalFactory;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Food.FoodFactory;
import NatureReserveSimulationLogic.Statistics.Statistics;
import NatureReserveSimulationLogic.Food.Plant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Logic {
    
    protected ArrayList<Animal> animals;
    protected ArrayList<Food> foods;
    protected int currentTurn;
    protected HashSet<Food> setFoods;
    protected AnimalFactory animalFactory;
    protected FoodFactory foodFactory;
    
    public Logic(FoodFactory foodFactory, AnimalFactory animalFactory, int numberAnimal, int numberFood) {    
        this.animalFactory = animalFactory;
        this.foodFactory = foodFactory;
        this.animals = createAnimals(numberAnimal);
        this.foods = createFoods(numberFood);
        currentTurn = 1;
        this.setFoods = new HashSet<>(foods);
    }
 
    public void startSimulation(boolean detailedVersion) {
        
        //I add all the animals in the foods list         
        foods.addAll(animals);
            
        while (!allAnimalIsDead() && currentTurn <= 100) {
            // prints the detailed version
            if(detailedVersion){
                System.out.println("DAY " + currentTurn);
                for(Animal animal : animals){
                    System.out.println(animal.toString());
                }
            }
            System.out.println("Turn---------------------------" + currentTurn);
            currentTurn++;
            allPlantsRegenNutrional();
            
            for (Animal animal : animals) {
                
                if (animal.isAlive()){
                    animal.increaseLifespan();
                    Food food = takeRandomFood();
                    if(animal.Feeding(food)){
                        food.getEated(animal.getMaximumEnergy() - animal.getCurrentEnergy());
                        
                        for(Animal a : animals){
                            if(setFoods.contains(a))
                                a.getEated(animal.getMaximumEnergy() - animal.getCurrentEnergy()); 
                        }
                    }
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
        for(Food food : foods){
            if(food instanceof Plant)
                ((Plant) food).regenNutrient();
        }
    }
    
    private String calculateMinLifespan() {
        int minLifespan = Integer.MAX_VALUE;
        String minLifespanPlusAnimal = "";
        for (Animal animal : animals) {
            int lifespan = animal.getLifespan();
            if (lifespan < minLifespan) {
                minLifespan = lifespan;
                minLifespanPlusAnimal = (Integer.toString(minLifespan)) + " and was made by: " + (animal.getName());
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
                maxLifespanPlusAnimal = (Integer.toString(maxLifespan)) + " and was made by: " + (animal.getName());            }
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
    
    public Food takeRandomFood(){ 
        Random r = new Random();
        int RandomIndex = r.nextInt(foods.size());
        return foods.get(RandomIndex);
    }
}