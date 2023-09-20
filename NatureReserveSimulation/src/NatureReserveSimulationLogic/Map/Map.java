package NatureReserveSimulationLogic.Map;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalFactory;
import NatureReserveSimulationLogic.Food.Food;
import NatureReserveSimulationLogic.Food.FoodFactory;
import java.util.ArrayList;
import java.util.Random;

public class Map {
    
    protected Biome[][] matrix;
    protected ArrayList<Biome> biomes;
    protected BiomeFactory biomeFactory;
    protected AnimalFactory animalFactory;
    protected FoodFactory foodFactory;
    
    public Map(AnimalFactory animalFactory, FoodFactory foodFactory, BiomeFactory biomeFactory){
        this.animalFactory = animalFactory;
        this.foodFactory = foodFactory;
        this.biomeFactory = biomeFactory;
        matrix = generateMatrix(3);
    }
    
    public void generateWorld(){
        
        Biome currentBiome;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                currentBiome = matrix[i][j];
                currentBiome.currentAnimals = createAnimals(GetRandomNumber(5), matrix[i][j]);
                currentBiome.currentFoods = createFoods(GetRandomNumber(25), matrix[i][j]); 
            }
        }
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
   
}
