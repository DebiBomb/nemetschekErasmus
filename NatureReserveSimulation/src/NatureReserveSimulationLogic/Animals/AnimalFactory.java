package NatureReserveSimulationLogic.Animals;

import NatureReserveSimulationLogic.Animals.AnimalClasses.Cat;
import NatureReserveSimulationLogic.Animals.AnimalClasses.Cow;
import NatureReserveSimulationLogic.Animals.AnimalClasses.Dog;
import NatureReserveSimulationLogic.Animals.AnimalClasses.Lion;
import java.util.ArrayList;

public class AnimalFactory {
    
    protected String[] animalNames = {};
    
    public AnimalFactory(String[] animalNames){
        this.animalNames = animalNames;
    }
    
    private Animal createAnimal(String name){
        switch (name) {
            case "cat":
                Cat cat = new Cat(5, Species.CAT);
              return cat;
            case "cow":
                Cow cow = new Cow(8, Species.COW);
              return cow;
            case "dog":
                Dog dog = new Dog(6, Species.DOG);
              return dog;
            case "lion":
                Lion lion = new Lion(10, Species.LION);
              return lion;
        }
        return null;
    }
    
    public ArrayList<Animal> CreateAllAnimals(int nAnimals){
        
        ArrayList<Animal> animals = new ArrayList<>();
        for(int i=0; i<=nAnimals; i++){
            int nRandom = (int)Math.floor(Math.random() * (animalNames.length - 1 + 1) + 0);
            animals.add(createAnimal(animalNames[nRandom]));
            }
        return animals;
    }
    
}        
