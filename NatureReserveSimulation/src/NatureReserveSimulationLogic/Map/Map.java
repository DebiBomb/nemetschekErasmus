package NatureReserveSimulationLogic.Map;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalFactory;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Food.FoodFactory;
import NatureReserveSimulationLogic.Statistics.Statistics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Map {
    
    protected Biome[][] matrix;
    protected ArrayList<Biome> biomes;
    protected BiomeFactory biomeFactory;
    protected AnimalFactory animalFactory;
    protected FoodFactory foodFactory;
    protected int currentTurn;
    
    public Map(AnimalFactory animalFactory, FoodFactory foodFactory, BiomeFactory biomeFactory){
        this.animalFactory = animalFactory;
        this.foodFactory = foodFactory;
        this.biomeFactory = biomeFactory;
        matrix = generateMatrix(3);
        currentTurn = 1;
    }
    
    public void generateWorld(boolean detailedVersion){
        
        Biome currentBiome;
        
        // create everything
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                currentBiome = matrix[i][j];
                currentBiome.currentAnimals = createAnimals(GetRandomNumber(5), matrix[i][j]);
                currentBiome.currentFoods = createFoods(GetRandomNumber(25), matrix[i][j]);
                currentBiome.setSetFoods(new HashSet<>(currentBiome.getCurrentFoods()));
            }
        }
        
        // start of the simulation
        
        // just the method for stop all        
        while(!StopSimulation() && currentTurn <= 100 ){
            
            
            System.out.println("Turn---------------------------" + currentTurn);          
            currentTurn++;
            
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                
                // get the current biom from the matrix
                currentBiome = matrix[i][j];
                
                // prints the detailed version
                if(detailedVersion){
                    System.out.println("DAY " + currentTurn);
                    System.out.println(currentBiome.toString());
                    for(Animal animal : currentBiome.currentAnimals){
                        System.out.println(animal.toString());
                    }
                }
                
                // restore all the plants
                currentBiome.allPlantsRegenNutrional();
                
                // feeding all the animals from the biome
                currentBiome.Feeding();
                
            }
        }
        }
        
        // Calculate statistics
        String nMin = calculateAllMinLifespan();
        String nMax = calculateAllMaxLifespan();
        String nAverage = calculateAllAverangeLifespan();

        Statistics statistics = new Statistics(nMin, nMax, nAverage);
        System.out.println("\nSTATISTICS:\n" + statistics);
        
    }
    
    private Biome[][] generateMatrix(int size){
        
        Biome[][] matrix = new Biome[size][size];
        
        for(int i=0; i<size; i++ ){
            for(int j=0; j<size; j++ ){
                matrix[i][j] = createRandomBiome(i,j);
            }
        }
        
        return matrix;
    }
    
    private Biome createRandomBiome(int x,int y){
        
        Random r = new Random();
        int randomNumber;        
        randomNumber = r.nextInt(biomeFactory.getBiomesMap().size());
        
        ArrayList<String> biomeNames = new ArrayList<>(biomeFactory.getBiomesMap().keySet());
        
        Biome biome = biomeFactory.createBiome(biomeNames.get(randomNumber));
        biome.x = x;
        biome.y = y;
        
        return biome;
    }
    
    public ArrayList<Animal> createAnimals(int randomNumber, Biome biome){
        
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<String> animalNames = new ArrayList(biome.getSupportedAnimals()); 
        
        for(int i=0; i<randomNumber; i++){     
            animals.add(animalFactory.createAnimal(animalNames.get(GetRandomNumber(biome.getSupportedAnimals().size()))));
        }       
        return animals;
    }
    
    public ArrayList<Food> createFoods(int randomNumber, Biome biome){
        
        ArrayList<Food> foods = new ArrayList<>();
        ArrayList<String> foodNames = new ArrayList<>(biome.getSupportedFoods());
        
        for(int i=0; i<randomNumber; i++){
            foods.add(foodFactory.createFood(foodNames.get(GetRandomNumber(biome.getSupportedFoods().size()))));
        }
        return foods;
    }
    
    public int GetRandomNumber(int range){
        int nRandom = 0;
        Random random = new Random();
        return random.nextInt(range);        
    }
    
    public boolean StopSimulation(){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                if(!matrix[i][j].isAllDead())
                    return false;
            }
        }
        return true;
    }
    
    private String calculateAllMinLifespan() {
        int minLifespan = Integer.MAX_VALUE;
        String minLifespanString = "";

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                int lifespan = matrix[i][j].calculateMinLifespan();
                if (lifespan < minLifespan){
                    minLifespan = lifespan;
                    minLifespanString = (Integer.toString(minLifespan)) + " and was made by: " + matrix[i][j].animalMinLifespan;
                }    
            }
        }
        return minLifespanString;
    }

    private String calculateAllMaxLifespan() {
        int maxLifespan = Integer.MAX_VALUE;
        String maxLifespanString = "";

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                int lifespan = matrix[i][j].calculateMaxLifespan();
                if (lifespan < maxLifespan){
                    maxLifespan = lifespan;
                    maxLifespanString = (Integer.toString(maxLifespan)) + " and was made by: " + matrix[i][j].animalMaxLifespan;
                }    
            }
        }
        return maxLifespanString;
    }

    private String calculateAllAverangeLifespan() {
        int totalLifespan = 0;
        int realTotalLifespan = 0;

        for(int i=0; i< matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                totalLifespan += matrix[i][j].calculateAverageLifespan();     
            }
        }
        
        realTotalLifespan = totalLifespan / (matrix.length * matrix[0].length);
        
        return (Integer.toString(realTotalLifespan));
    }
   
}
