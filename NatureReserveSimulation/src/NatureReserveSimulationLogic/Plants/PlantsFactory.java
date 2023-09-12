package NatureReserveSimulationLogic.Plants;

import NatureReserveSimulationLogic.Plants.PlantsClasses.*;
import java.util.ArrayList;

public class PlantsFactory {
    protected String[] plantsNames = {};
    
    public PlantsFactory(String[] plantsNames){
        this.plantsNames = plantsNames;
    }
    
    public Plant createPlant(String name){
        switch (name) {
            case "climbers":
                Climbers climbers = new Climbers(SpeciesPlants.CLIMBERS);
              return climbers;
            case "creepers":
                Creepers creepers = new Creepers(SpeciesPlants.CREEPERS);
              return creepers;
            case "herbs":
                Herbs herbs = new Herbs(SpeciesPlants.HERBS);
            case "shrubs":
                Shrubs shrubs = new Shrubs(SpeciesPlants.SHRUBS);    
              return shrubs;
            case "trees":
                Trees trees = new Trees(SpeciesPlants.TREES);
              return trees;
        }
        return null;
    }
    
    public ArrayList<Plant> CreateAllPlants(int nPlants){
        
        ArrayList<Plant> plants = new ArrayList<>();
        for(int i=0; i<=nPlants; i++){
            int nRandom = (int)Math.floor(Math.random() * (plantsNames.length - 1 + 1) + 0);
            plants.add(createPlant(plantsNames[nRandom]));
            }
        return plants;
    }
}
