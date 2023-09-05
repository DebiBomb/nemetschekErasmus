package NatureReserveSimulationLogic.Statistics;

public class Statistics {
    
    protected String min, max;
    protected String averange;
    
    public Statistics(String min, String max, String averange){
        
        this.min = min;
        this.max = max;
        this.averange = averange;
    }

    public String getMin() {
        return min;
    }

    public String getMax() {
        return max;
    }

    public String getAverange() {
        return averange;
    }

    @Override
    public String toString() {
        return ("minimum lifespan: " + min + "\nmaximum lifespan: " + max + "\naverange lifespan: " + averange);
    }
    
    
}
