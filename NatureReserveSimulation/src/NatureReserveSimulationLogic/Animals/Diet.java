package NatureReserveSimulationLogic.Animals;
import NatureReserveSimulationLogic.Food.Food;
import java.util.ArrayList;

public class Diet {
       
        private ArrayList<Food> foods = new ArrayList<Food>();
        
        public Diet( ArrayList<Food> foods){
            
            this.foods = foods;
        }

    public ArrayList<Food> getFoods() {
        return foods;
    }
        
    }
