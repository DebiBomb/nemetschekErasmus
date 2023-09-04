package NatureReserveSimulationLogic.Animals;

import java.util.ArrayList;

public enum Species {
    
    CAT, COW, DOG, LION;
    
    private ArrayList<Species> listSpecies = new ArrayList<Species>();
    
    public ArrayList<Species> getListSpecies() {
        return listSpecies;
    }
    
}
