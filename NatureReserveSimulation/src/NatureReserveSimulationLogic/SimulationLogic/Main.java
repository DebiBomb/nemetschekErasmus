package NatureReserveSimulationLogic.SimulationLogic;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.AnimalFactory;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        String[] animalNames = {"cat", "cow", "dog", "lion"};
        AnimalFactory factory = new AnimalFactory(animalNames);
        ArrayList<Animal> animals = factory.CreateAllAnimals(4);
        Logic l = new Logic(animals);
        l.startSimulation();
    }
    
}
