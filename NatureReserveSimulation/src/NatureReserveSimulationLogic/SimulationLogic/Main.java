package NatureReserveSimulationLogic.SimulationLogic;

import NatureReserveSimulationLogic.Animals.Animal;
import NatureReserveSimulationLogic.Animals.Diet;
import NatureReserveSimulationLogic.Animals.Species;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Food> foods1 = new ArrayList<Food>();
        ArrayList<Food> foods2 = new ArrayList<Food>();
        ArrayList<Food> foods3 = new ArrayList<Food>();
        ArrayList<Food> foods4 = new ArrayList<Food>();
        
        foods1.add(Food.BEEF);
        foods1.add(Food.APPLE);
        foods2.add(Food.BANANA);
        foods2.add(Food.GRASS);
        foods3.add(Food.PORK);
        foods3.add(Food.LEAF);
        foods4.add(Food.STRAWBERRY);
        foods4.add(Food.POTATO);
        
        Diet dCat, dCow, dDog, dLeopard;
          
        dCat = new Diet(foods1);
        dCow = new Diet(foods2);
        dDog = new Diet(foods3);
        dLeopard = new Diet(foods4);
        
        Animal cat, cow, dog, leopard;
        
        cat = new Animal(10, dCat, Species.CAT);
        cow = new Animal(10, dCow, Species.COW);
        dog = new Animal(10, dDog, Species.DOG);
        leopard = new Animal(10, dLeopard, Species.LEOPARD);
        
        System.out.println("The simulation presence this animals: ");
        System.out.println(cat);
        System.out.println(cow);
        System.out.println(dog);
        System.out.println(leopard);
        
        Random r = new Random();
        for(int i=0; i<8; i++){
            switch (r.nextInt(9)){
  case 0:
    cat.Feeding(Food.APPLE);
    break;
  case 1:
    System.out.println("Tuesday");
    break;
  case 2:
    System.out.println("Wednesday");
    break;
  case 3:
    System.out.println("Thursday");
    break;
  case 4:
    System.out.println("Friday");
    break;
  case 5:
    System.out.println("Saturday");
    break;
  case 6:
    System.out.println("Sunday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
  case 8:
    System.out.println("Sunday");
    break;  
}
        
    }
    
}
