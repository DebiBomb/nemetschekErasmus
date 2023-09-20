package NatureReserveSimulationLogic.Map;

import java.util.HashMap;
import java.util.function.Supplier;

public class BiomeFactory {
    
    protected HashMap<String, Supplier<Biome>> biomesMap;
    
    public BiomeFactory(HashMap<String, Supplier<Biome>> biomesMap){
        this.biomesMap = biomesMap;
    }
    
    public Biome createBiome(String biomeName){
        Supplier<Biome> supplierBiome = biomesMap.get(biomeName);
        return supplierBiome.get();
    }   

    public HashMap<String, Supplier<Biome>> getBiomesMap() {
        return biomesMap;
    }    
    
    
}        

