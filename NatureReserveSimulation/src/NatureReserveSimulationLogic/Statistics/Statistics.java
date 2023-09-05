package NatureReserveSimulationLogic.Statistics;

public class Statistics {
    
    protected int min, max;
    protected double averange;
    
    public Statistics(int min, int max, double averange){
        
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

    public double getAverange() {
        return averange;
    }

    @Override
    public String toString() {
        return ("minimum lifespan: " + min + "\nmaximum lifespan: " + max + "\naverange lifespan: " + averange);
    }
    
    
}
