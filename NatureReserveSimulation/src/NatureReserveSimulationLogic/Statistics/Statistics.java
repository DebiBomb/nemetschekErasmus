package NatureReserveSimulationLogic.Statistics;

public class Statistics {
    
    private int min, max, averange;
    
    public Statistics(int min, int max, int averange){
        
        this.min = min;
        this.max = max;
        this.averange = averange;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getAverange() {
        return averange;
    }

    @Override
    public String toString() {
        return ("minimum lifespan: " + min + "\nmaximum lifespan: " + max + "\naverange lifespan: " + averange);
    }
    
    
}
